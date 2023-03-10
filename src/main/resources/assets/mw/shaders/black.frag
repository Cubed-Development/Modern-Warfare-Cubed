#version 120

uniform sampler2D tex;
varying vec2 tex_coord;

void main(){
	gl_FragColor = vec4(0.133, 0.184, 0.243, 1)*0.3;
}