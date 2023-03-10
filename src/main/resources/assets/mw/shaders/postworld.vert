#version 120

varying vec2 tex_coord;
varying vec4 gltex;
uniform mat4 inverseProjectionMatrix;

void main(){
	tex_coord = gl_MultiTexCoord0.st;
	gl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;
	//gltex = gl_Vertex;



}
