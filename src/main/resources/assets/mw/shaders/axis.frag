#version 120

uniform sampler2D tex;
varying vec2 tex_coord;
varying vec4 color;
varying vec4 pos;
varying vec4 rawPos;

uniform float zoom;


void main(){

	vec4 mod = color;

	
	float dist = length(pos+vec4(0, 0, 0, 0))/(zoom);
	mod.a = 1-pow(dist, 12);

	gl_FragColor = mod;




	//gl_FragColor = vec4(0.133, 0.184, 0.243, 1);
}