#version 120

attribute vec3 aPos;
attribute vec2 aTexCoord;
attribute vec3 aNormal;

varying vec2 texCoord;

attribute vec3 inPosition;
attribute vec4 inQuat;
attribute vec2 inLightmapCoords;

// Please check out this guy's website, it is an AMAZING resource,
// straight forward, and practical.
// https://www.geeks3d.com/20141201/how-to-rotate-a-vertex-by-a-quaternion-in-glsl/

/*
//	QUATERNION STUFF
*/

vec4 conjugate(vec4 quat) {
	return vec4(-quat.x, -quat.y, -quat.z, quat.w);
}

vec4 multQuat(vec4 q1, vec4 q2) {
	vec4 qr;
  qr.x = (q1.w * q2.x) + (q1.x * q2.w) + (q1.y * q2.z) - (q1.z * q2.y);
  qr.y = (q1.w * q2.y) - (q1.x * q2.z) + (q1.y * q2.w) + (q1.z * q2.x);
  qr.z = (q1.w * q2.z) + (q1.x * q2.y) - (q1.y * q2.x) + (q1.z * q2.w);
  qr.w = (q1.w * q2.w) - (q1.x * q2.x) - (q1.y * q2.y) - (q1.z * q2.z);
  return qr;
}


vec4 rotateVertex(vec3 position, vec4 quat) {
	vec4 conQuat = conjugate(quat);
	vec4 first = multQuat(quat, vec4(position.xyz, 0));
	vec4 final = multQuat(first, conQuat);

	// Does not work if this is not set to one
	final.w = 1;
	return final;
}

varying vec2 lightmapTexCoord;
varying vec3 lightSum;

void main(){


	// Calculate lighting
	lightmapTexCoord = inLightmapCoords;
	//lightmapTexCoord = (gl_TextureMatrix[1]*vec4(inLightmapCoords.x/255, inLightmapCoords.y/255, 0, 0));
	//lightmapTexCoord = (gl_TextureMatrix[1] * gl_MultiTexCoord1).xy;
	vec3 normal = (gl_NormalMatrix * aNormal).xyz;
	vec4 totalLight = vec4(0.0F);
	for (int i = 0; i < gl_MaxLights; i ++){
			vec4 diffuse = gl_FrontLightProduct[i].diffuse * max(dot(normal,gl_LightSource[i].position.xyz), 0.0f);
			diffuse = clamp(diffuse, 0.0F, 1.0F);

			totalLight += diffuse + gl_FrontLightProduct[i].ambient;
	}
	lightSum = clamp((totalLight + gl_LightModel.ambient).rgb, 0.0F, 1.0F);


	// Convert the attribute position to 4D vector
	vec4 position = vec4(inPosition, 0);


	// Rotate the vertex position
	vec4 vertexPosition = rotateVertex(aPos, inQuat);



	texCoord = aTexCoord;
	gl_Position = gl_ModelViewProjectionMatrix * (vertexPosition+position);

}
