#version 120

uniform vec4 Position;

uniform vec2 InSize = vec2(1.0, 1.0);
uniform vec2 OutSize = vec2(1.0, 1.0);

const vec3 TAN_VEC = vec3(1, 0, 0);

varying vec2 texCoord;
uniform mat4 projection;

varying vec4 posi;
varying vec3 normal;
varying vec3 tangent;

//varying float pnet;

void main(){
    texCoord = gl_MultiTexCoord0.st;
    gl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;

    //oneTexel = 1.0 / InSize;

    //pnet = gl_Position.z;


    tangent = normalize(cross(TAN_VEC, gl_Normal)*gl_NormalMatrix);
    normal = normalize(gl_NormalMatrix*gl_Normal);
    posi = gl_ModelViewMatrix*gl_Vertex;
}
