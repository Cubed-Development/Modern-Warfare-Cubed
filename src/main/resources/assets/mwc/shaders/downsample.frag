#version 120

/*
Downsamples into BloomBuffers
Author: Homer Riva-Cambrin
Version: September 26th, 2022
*/

uniform vec2 texel;
uniform sampler2D tex;

varying vec2 tex_coord;

const float OUTER_WEIGHT = 0.03125;
const float MEDIUM_WEIGHT = 0.0625;
const float LIGHT_WEIGHT = 0.125;

void main(){
		gl_FragColor = vec4(0);

		float TEXEL_TWO_RIGHT_X = 2*texel.x;
		float TEXEL_TWO_LEFT_X = -2*texel.x;
		float TEXEL_TWO_UP_Y = -2*texel.y;
		float TEXEL_TWO_DOWN_Y = 2*texel.y;


		// Weight is 0.03125
		gl_FragColor += texture2D(tex, tex_coord+vec2(TEXEL_TWO_LEFT_X, TEXEL_TWO_UP_Y))*OUTER_WEIGHT;
		gl_FragColor += texture2D(tex, tex_coord+vec2(TEXEL_TWO_RIGHT_X, TEXEL_TWO_UP_Y))*OUTER_WEIGHT;
		gl_FragColor += texture2D(tex, tex_coord+vec2(TEXEL_TWO_LEFT_X, TEXEL_TWO_DOWN_Y))*OUTER_WEIGHT;
		gl_FragColor += texture2D(tex, tex_coord+vec2(TEXEL_TWO_RIGHT_X, TEXEL_TWO_DOWN_Y))*OUTER_WEIGHT;

		// Weight is 0.0625
		gl_FragColor += texture2D(tex, tex_coord+vec2(0, TEXEL_TWO_UP_Y))*MEDIUM_WEIGHT;
		gl_FragColor += texture2D(tex, tex_coord+vec2(TEXEL_TWO_LEFT_X, 0))*MEDIUM_WEIGHT;
		gl_FragColor += texture2D(tex, tex_coord+vec2(TEXEL_TWO_RIGHT_X, 0))*MEDIUM_WEIGHT;
		gl_FragColor += texture2D(tex, tex_coord+vec2(0, TEXEL_TWO_DOWN_Y))*MEDIUM_WEIGHT;


		float TEXEL_ONE_RIGHT_X = texel.x;
		float TEXEL_ONE_LEFT_X = -texel.x;
		float TEXEL_ONE_UP_Y = -texel.y;
		float TEXEL_ONE_DOWN_Y = texel.y;

		// Weight is 0.125
		gl_FragColor += texture2D(tex, tex_coord+vec2(TEXEL_ONE_LEFT_X, TEXEL_ONE_UP_Y))*LIGHT_WEIGHT;
		gl_FragColor += texture2D(tex, tex_coord+vec2(TEXEL_ONE_LEFT_X, TEXEL_ONE_DOWN_Y))*LIGHT_WEIGHT;
		gl_FragColor += texture2D(tex, tex_coord+vec2(TEXEL_ONE_RIGHT_X, TEXEL_ONE_UP_Y))*LIGHT_WEIGHT;
		gl_FragColor += texture2D(tex, tex_coord+vec2(TEXEL_ONE_RIGHT_X, TEXEL_ONE_DOWN_Y))*LIGHT_WEIGHT;

		gl_FragColor += texture2D(tex, tex_coord)*LIGHT_WEIGHT;
}
