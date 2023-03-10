#version 120

uniform sampler2D tex;
varying vec2 tex_coord;
uniform int id;

void main(){
	gl_FragColor = vec4(id/255.0, 0, 0, 1);
}