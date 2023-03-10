#version 120

uniform vec2 texel;
uniform sampler2D tex;
uniform sampler2D depth;

varying vec2 tex_coord;
uniform vec2 res;


void main(){
	vec4 primary = texture2D(tex, tex_coord);
	//primary.a *= 0.6;
	gl_FragColor = primary;
}