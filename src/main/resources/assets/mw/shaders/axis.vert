#version 120

varying vec2 tex_coord;
varying vec4 color;
varying vec4 pos;
varying vec4 rawPos;

float rand(vec2 co){
    return fract(sin(dot(co, vec2(12.9898, 78.233))) * 43758.5453);
}

void main(){
	tex_coord = gl_MultiTexCoord0.st;
	vec4 vertex = gl_Vertex;

	gl_Position = gl_ModelViewProjectionMatrix * vertex;
	
	
	
	
	
	rawPos = vertex;
	
	pos = gl_Position;
	color = gl_Color;
	
	
	
	//gl_Color = gl_FrontColor;
}