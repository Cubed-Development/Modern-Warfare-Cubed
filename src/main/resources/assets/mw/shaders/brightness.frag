#version 120

uniform sampler2D tex0;

varying vec2 texCoord;

uniform vec3 color;
uniform float brightness;



void main(){




   gl_FragColor = vec4(color*brightness, 1);

}
