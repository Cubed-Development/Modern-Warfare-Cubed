package com.paneedah.weaponlib.vehicle.collisions;

import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;

import javax.vecmath.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RigidBody {


    public static final Vec3d[] cardinals = new Vec3d[]{
            new Vec3d(1, 0, 0), new Vec3d(0, 1, 0), new Vec3d(0, 0, 1),
            new Vec3d(-1, 0, 0), new Vec3d(0, -1, 0), new Vec3d(0, 0, -1)};

    public static final RigidBody DUMMY = new RigidBody(null) {
        public void solveContacts(float dt) {}

        public void impulse(Vec3d force, Vec3d position) {}

        public void updateOrientation() {}

        public void updateGlobalCentroidFromPosition() {}

        public void updatePositionFromGlobalCentroid() {}

        public void doTimeStep(float dt) {}

        public void addColliders(OreintedBB... collide) {}

        public Vec3d globalToLocalPos(Vec3d pos) {return pos;}

        public Vec3d localToGlobalPos(Vec3d pos) {return pos;}

        public Vec3d globalToLocalVec(Vec3d vec) {return vec;}

        public Vec3d localToGlobalVec(Vec3d vec) {return vec;}

        public void addLinearVelocity(Vec3d v) {}

        public void addAngularVelocity(Vec3d v) {}

        public void addContact(Contact c) {}

    };

    static {
        DUMMY.inv_rotation = (Matrix3f) DUMMY.rotation.clone();
        DUMMY.localInertiaTensor = new Matrix3f();
        DUMMY.inv_localInertiaTensor = new Matrix3f();
        DUMMY.inv_globalInertiaTensor = new Matrix3f();
        DUMMY.localCentroid = new Vec3d(0, 0, 0);
        DUMMY.globalCentroid = new Vec3d(0, 0, 0);
    }

    public World world;
    public AxisAlignedBB boundingBox;

    public List<OreintedBB> colliders = new ArrayList<>();
    public List<AxisAlignedBB> colliderBoundingBoxes = new ArrayList<>();

    public Vec3d position = new Vec3d(0, 0, 0);
    public Vec3d globalCentroid;
    public Matrix3f rotation = new Matrix3f();
    public Matrix3f inv_rotation;

    public Vec3d prevPosition = new Vec3d(0, 0, 0);
    public Quat4f prevRotation = new Quat4f();

    public Vec3d linearVelocity = new Vec3d(0, 0, 0);
    public Vec3d angularVelocity = new Vec3d(0, 0, 0);
    public Vec3d force = new Vec3d(0, 0, 0);
    public Vec3d torque = new Vec3d(0, 0, 0);

    public float mass;
    public float inv_mass;
    public Matrix3f localInertiaTensor;
    public Matrix3f inv_localInertiaTensor;
    public Matrix3f inv_globalInertiaTensor;
    public float friction = 0.5F;
    public float restitution = 0;

    public Vec3d localCentroid;

    public ContactManifold contacts = new ContactManifold();

    public RigidBody(World w) {
        world = w;
        rotation.setIdentity();
    }

    public RigidBody(World w, double x, double y, double z) {
        this(w);
        position = new Vec3d(x, y, z);
    }

    public void minecraftTimestep() {
        setPrevData();
        int timeStepSubDiv = 8;
        float step = 0.05F / (float) timeStepSubDiv;
        for (int i = 0; i < timeStepSubDiv; i++) {
            doTimeStep(step);
        }
    }

    public void doTimeStep(float dt) {
        contacts.update();
        //Do collision detection
        GJKResult bestInfo = null;
        OreintedBB a = null;
        OreintedBB b;
        AxisAlignedBB bb = new AxisAlignedBB(-2, -2, -2, 2, 2, 2);
        List<AxisAlignedBB> l = world.getCollisionBoxes(null, bb.offset(position));
        //System.out.println(boundingBox);
        for (AxisAlignedBB box : l) {
            for (int i = 0; i < colliders.size(); i++) {

                OreintedBB c = colliders.get(i);

                b = OreintedBB.fromAABB(box);
                GJKResult info = OBBCollider.areColliding(c, b);
                if (info.status == GJKResult.Status.COLLIDING /*&& (bestInfo == null || bestInfo.depth < info.depth)*/) {
                    //No need to find whatever is deepest. We can just add every contact and let the manifold sort itself out correctly.
                    //bestInfo = info;
                    contacts.addContact(new Contact(this, null, c, b, info));
                }
            }
        }

        solveContacts(dt);
        integrateVelocityAndPosition(dt);


        for (OreintedBB ob : colliders) {
            ob.axis = new Matrix3d(rotation);
            ob.inverse = new Matrix3d(inv_rotation);
            ob.setPosition(position.x, position.y, position.z);

        }
    }

    public void integrateVelocityAndPosition(float dt) {
        //Integrate velocity
        linearVelocity = linearVelocity.add(force.scale(inv_mass * dt));
        angularVelocity = angularVelocity.add(RigidBody.matrixTransformVector(inv_globalInertiaTensor, torque.scale(dt)));


        force = Vec3d.ZERO;
        torque = Vec3d.ZERO;

        //Integrate position
        globalCentroid = globalCentroid.add(linearVelocity.scale(dt));
        if (angularVelocity.lengthSquared() > 0) {
            Vec3d axis = angularVelocity.normalize();
            double angle = angularVelocity.length() * dt;
            Matrix3f turn = new Matrix3f();
            turn.set(new AxisAngle4f((float) axis.x, (float) axis.y, (float) axis.z, (float) angle));
            turn.mul(rotation);
            rotation = turn;
            updateOrientation();
        }
        updatePositionFromGlobalCentroid();
        updateAABBs();
        addLinearVelocity(new Vec3d(0, -9.81 * dt, 0));
    }

    public void setPrevData() {
        prevPosition = position;
        setFromMat(prevRotation, rotation);
    }

    public void addContact(Contact c) {
        contacts.addContact(c);
    }

    public void solveContacts(float dt) {
        for (int j = 0; j < contacts.contactCount; j++) {
            contacts.contacts[j].init(dt);
        }
        int velocityIterations = 4;
        for (int i = 0; i < velocityIterations; i++) {
            for (int j = 0; j < contacts.contactCount; j++) {
                contacts.contacts[j].solve(dt);
            }
        }
    }

    public Vec3d localToGlobalPos(Vec3d pos) {
        return matrixTransformVector(rotation, pos).add(pos);
    }

    public Vec3d globalToLocalPos(Vec3d pos) {
        return matrixTransformVector(inv_rotation, pos.subtract(position));
    }

    public Vec3d localToGlobalVec(Vec3d vec) {
        return matrixTransformVector(rotation, vec);
    }

    public Vec3d globalToLocalVec(Vec3d vec) {
        return matrixTransformVector(inv_rotation, vec);

    }

    public void addLinearVelocity(Vec3d v) {
        linearVelocity = linearVelocity.add(v);
    }

    public void addAngularVelocity(Vec3d v) {
        angularVelocity = angularVelocity.add(v);
    }

    public void impulse(Vec3d force, Vec3d position) {
        this.force = this.force.add(force);
        torque = torque.add(position.subtract(globalCentroid).crossProduct(force));
    }

    public void impulseVelocity(Vec3d force, Vec3d position) {
        linearVelocity = linearVelocity.add(force.scale(inv_mass));
        angularVelocity = angularVelocity.add(matrixTransformVector(inv_globalInertiaTensor, position.subtract(globalCentroid).crossProduct(force)));
    }

    public void impulseVelocityDirect(Vec3d force, Vec3d position) {
        linearVelocity = linearVelocity.add(force);
        angularVelocity = angularVelocity.add(position.subtract(globalCentroid).crossProduct(force));
    }

    public void updateOrientation() {
        Quat4f quat = new Quat4f();
        float epsilon = 0.00001F;
        //quat.set(rotation);
        setFromMat(quat, rotation);
        quat.normalize();
        QuaternionTool.matrixFromQuat(rotation, quat);
        inv_rotation = (Matrix3f) rotation.clone();
        inv_rotation.transpose();


        inv_globalInertiaTensor.set(inv_rotation);
        inv_globalInertiaTensor.mul(inv_localInertiaTensor);
        inv_globalInertiaTensor.mul(rotation);
    }

    public void updatePositionFromGlobalCentroid() {
        position = globalCentroid.add(matrixTransformVector(rotation, localCentroid.scale(-1)));
    }

    public void updateGlobalCentroidFromPosition() {
        globalCentroid = matrixTransformVector(rotation, localCentroid).add(position);
    }


    public void updateAABBs() {
        colliderBoundingBoxes.clear();
        double tMaxX, tMaxY, tMaxZ, tMinX, tMinY, tMinZ;
        tMaxX = tMaxY = tMaxZ = -Double.MAX_VALUE;
        tMinX = tMinY = tMinZ = Double.MAX_VALUE;
        for (OreintedBB c : colliders) {
            double maxX = OBBCollider.localSupport(this, c, cardinals[0]).x;
            double maxY = OBBCollider.localSupport(this, c, cardinals[1]).y;
            double maxZ = OBBCollider.localSupport(this, c, cardinals[2]).z;
            double minX = OBBCollider.localSupport(this, c, cardinals[3]).x;
            double minY = OBBCollider.localSupport(this, c, cardinals[4]).y;
            double minZ = OBBCollider.localSupport(this, c, cardinals[5]).z;
            colliderBoundingBoxes.add(new AxisAlignedBB(minX, minY, minZ, maxX, maxY, maxZ));
            tMaxX = Math.max(tMaxX, maxX);
            tMaxY = Math.max(tMaxY, maxY);
            tMaxZ = Math.max(tMaxZ, maxZ);
            tMinX = Math.min(tMinX, minX);
            tMinY = Math.min(tMinY, minY);
            tMinZ = Math.min(tMinZ, minZ);
        }
        boundingBox = new AxisAlignedBB(tMinX / 2, tMinY / 2, tMinZ / 2, tMaxX / 2, tMaxY / 2, tMaxZ / 2);
    }

    public void addColliders(OreintedBB... collide) {
        Collections.addAll(colliders, collide);
        localCentroid = new Vec3d(0, 0, 0);
        mass = 0;
        for (OreintedBB c : colliders) {
            mass += (float) c.mass;
            localCentroid = localCentroid.add(c.localCentroid.scale(c.mass));
        }
        inv_mass = 1F / mass;
        localCentroid = localCentroid.scale(inv_mass);

        localInertiaTensor = new Matrix3f();
        for (OreintedBB c : colliders) {
            //https://en.wikipedia.org/wiki/Parallel_axis_theorem
            Vec3d colliderToLocal = localCentroid.subtract(c.localCentroid);
            double lenSquared = colliderToLocal.dotProduct(colliderToLocal);
            Matrix3f outerProduct = outerProduct(colliderToLocal, colliderToLocal);

            Matrix3f colliderToLocalMat = new Matrix3f();
            colliderToLocalMat.setIdentity();
            colliderToLocalMat.mul((float) lenSquared);
            colliderToLocalMat.sub(outerProduct);
            colliderToLocalMat.mul((float) c.mass);
            Matrix3f cLocalIT = (Matrix3f) c.inertiaTensor.clone();
            cLocalIT.add(colliderToLocalMat);
            localInertiaTensor.add(cLocalIT);
        }
        inv_localInertiaTensor = new Matrix3f();
        inv_localInertiaTensor.set(localInertiaTensor);

        inv_localInertiaTensor.invert();
        inv_globalInertiaTensor = new Matrix3f();
        updateOrientation();
        updateGlobalCentroidFromPosition();
        prevPosition = position;
        updateAABBs();
    }

    public void setRotation(float yaw, float pitch, float roll) {
        rotation.setIdentity();
        rotate(yaw, pitch, roll);
    }

    public void rotate(float yaw, float pitch, float roll) {
        Matrix3f mY = new Matrix3f();
        mY.rotY(yaw);
        Matrix3f mP = new Matrix3f();
        mP.rotX(pitch);
        Matrix3f mR = new Matrix3f();
        mR.rotZ(roll);
        mR.mul(mP);
        mR.mul(mY);
        rotation.mul(mR);
    }

    public static Vector3f getRealVector(Vec3d vec) {
        return new Vector3f((float) vec.x, (float) vec.y, (float) vec.z);
    }

    public static Vec3d getCringeVec(Vector3f v) {
        return new Vec3d(v.x, v.y, v.z);
    }

    public static Vec3d matrixTransformVector(Matrix3f mat, Vec3d v) {
        Vector3f re = getRealVector(v);
        mat.transform(re);
        return getCringeVec(re);
    }

    public static void setFromMat(Quat4f q, Matrix3f mat) {
        setFromMat(q, mat.m00, mat.m01, mat.m02, mat.m10, mat.m11, mat.m12, mat.m20, mat.m21, mat.m22);
    }

    public static void setFromMat(Quat4f q, float m00, float m01, float m02, float m10,
                                  float m11, float m12, float m20, float m21, float m22) {

        float s;
        float tr = m00 + m11 + m22;
        if (tr >= 0.0) {
            s = (float) Math.sqrt(tr + 1.0);
            q.w = s * 0.5f;
            s = 0.5f / s;
            q.x = (m21 - m12) * s;
            q.y = (m02 - m20) * s;
            q.z = (m10 - m01) * s;
        } else {
            float max = Math.max(Math.max(m00, m11), m22);
            if (max == m00) {
                s = (float) Math.sqrt(m00 - (m11 + m22) + 1.0);
                q.x = s * 0.5f;
                s = 0.5f / s;
                q.y = (m01 + m10) * s;
                q.z = (m20 + m02) * s;
                q.w = (m21 - m12) * s;
            } else if (max == m11) {
                s = (float) Math.sqrt(m11 - (m22 + m00) + 1.0);
                q.y = s * 0.5f;
                s = 0.5f / s;
                q.z = (m12 + m21) * s;
                q.x = (m01 + m10) * s;
                q.w = (m02 - m20) * s;
            } else {
                s = (float) Math.sqrt(m22 - (m00 + m11) + 1.0);
                q.z = s * 0.5f;
                s = 0.5f / s;
                q.x = (m20 + m02) * s;
                q.y = (m12 + m21) * s;
                q.w = (m10 - m01) * s;
            }
        }
    }

    public Matrix3f outerProduct(Vec3d one, Vec3d two) {
        return new Matrix3f(
                (float) (one.x * two.x), (float) (one.x * two.y), (float) (one.x * two.z),
                (float) (one.y * two.x), (float) (one.y * two.y), (float) (one.y * two.z),
                (float) (one.z * two.x), (float) (one.z * two.y), (float) (one.z * two.z));
    }

    public void solveCollisionWith(RigidBody body) {


    }


}
