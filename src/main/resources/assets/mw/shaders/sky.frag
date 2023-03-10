#version 120

uniform samplerCube skySampla;
uniform sampler2D tex;
varying vec3 tex_coord;
varying vec2 texCoord;


void main(){
	gl_FragColor = texture2D(tex, vec2(tex_coord));
	
	gl_FragColor = textureCube(skySampla, tex_coord);
}