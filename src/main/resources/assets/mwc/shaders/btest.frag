#version 120

/*
Takes HDR framebuffer and writes to the bloom buffer
Author: Homer Riva-Cambrin
Version: September 26th, 2022
*/

// Uniforms
varying vec2 tex_coord;
uniform sampler2D real;

// Constants
const vec4 ALPHA_COLOR = vec4(0.0, 0.0, 0.0, 1.0);
const vec3 BRIGHTNESS_THRESHOLD_COLOR = vec3(0.13819, 0.46488, 0.04693);

void main(){
		vec4 primary = texture2D(real, tex_coord);
		float brightness = dot(primary.rgb, BRIGHTNESS_THRESHOLD_COLOR);
  	if(brightness > 1.0)
      	gl_FragColor = vec4(primary.rgb*0.3, 1.0);
 		else
		 		gl_FragColor = ALPHA_COLOR;
}
