#version 120

uniform vec2 texel;
uniform sampler2D tex;

varying vec2 tex_coord;

void main(){
	vec4 color = texture2D(tex, tex_coord + vec2(texel.x, texel.y));
	color += texture2D(tex, tex_coord + vec2(-texel.x, texel.y));
	color += texture2D(tex, tex_coord + vec2(texel.x, -texel.y));
	color += texture2D(tex, tex_coord + vec2(-texel.x, -texel.y));
	gl_FragColor = color*0.25;
}