#version 120

uniform sampler2D tex0;

varying vec2 texCoord;
uniform bool bloom;
uniform bool natural;



void main(){

   vec4 primary = texture2D(tex0, texCoord);
   
	gl_FragColor = primary*2;
}
