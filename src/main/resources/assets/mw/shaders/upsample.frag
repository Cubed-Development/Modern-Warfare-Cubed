#version 120

/*
Upsamples into BloomBuffers

Author: Homer Riva-Cambrin
Version: September 26th, 2022
*/


uniform sampler2D texture;
uniform vec2 fragmentSize;

varying vec2 tex_coord;

const float LIGHT_WEIGHT = 0.0625;
const float MEDIUM_WEIGHT = 0.125;
const float HEAVY_HEIGHT = 0.25;


void main(){
		gl_FragColor = vec4(0);

		gl_FragColor += texture2D(texture, tex_coord+vec2(-fragmentSize.x, -fragmentSize.y))*LIGHT_WEIGHT;
		gl_FragColor += texture2D(texture, tex_coord+vec2(fragmentSize.x, -fragmentSize.y))*LIGHT_WEIGHT;
		gl_FragColor += texture2D(texture, tex_coord+vec2(fragmentSize.x, fragmentSize.y))*LIGHT_WEIGHT;
		gl_FragColor += texture2D(texture, tex_coord+vec2(-fragmentSize.x, fragmentSize.y))*LIGHT_WEIGHT;

		gl_FragColor += texture2D(texture, tex_coord+vec2(0, fragmentSize.y))*MEDIUM_WEIGHT;
		gl_FragColor += texture2D(texture, tex_coord+vec2(0, -fragmentSize.y))*MEDIUM_WEIGHT;
		gl_FragColor += texture2D(texture, tex_coord+vec2(fragmentSize.x, 0))*MEDIUM_WEIGHT;
		gl_FragColor += texture2D(texture, tex_coord+vec2(-fragmentSize.x, 0))*MEDIUM_WEIGHT;

		gl_FragColor += texture2D(texture, tex_coord)*HEAVY_HEIGHT;
}
