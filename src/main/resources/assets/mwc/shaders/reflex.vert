#version 120

uniform vec4 Position;

uniform vec2 InSize = vec2(1.0, 1.0);
uniform vec2 OutSize = vec2(1.0, 1.0);

varying vec4 posi;
varying vec3 normal;
varying vec3 tangent;

varying vec2 texCoord;
uniform mat4 projection;


void main(){
	
    texCoord = gl_MultiTexCoord0.st;
    gl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;
    
    
    tangent = normalize(cross(vec3(1,0,0), gl_Normal)*gl_NormalMatrix);
    normal = normalize(gl_NormalMatrix*gl_Normal);
  // normal = normalize(mat3(gl_NormalMatrix)*gl_Normal);
   // normal = normalize(vec3(gl_ModelViewProjectionMatrix*vec4(gl_Normal, 1.0)));
    
    posi = gl_ModelViewMatrix*gl_Vertex;
}