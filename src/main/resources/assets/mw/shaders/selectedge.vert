#version 120

varying vec2 tex_coord;

varying vec3 v_Normal;
varying vec3 v_fragmentToCamera;

void main(){
	
	tex_coord = gl_MultiTexCoord0.st;
	gl_Position = gl_Vertex;


	
}