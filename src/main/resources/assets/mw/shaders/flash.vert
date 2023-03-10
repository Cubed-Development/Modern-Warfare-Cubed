#version 120

varying vec2 texCoord;

float rand(vec2 co){
    return fract(sin(dot(co, vec2(12.9898, 78.233))) * 43758.5453);
}

void main(){
    texCoord = gl_MultiTexCoord0.st;
    gl_Position = gl_ModelViewProjectionMatrix * gl_Vertex + vec4(0, 0, 0.0, 0);
	
}