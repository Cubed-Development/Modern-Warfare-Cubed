#version 120

varying vec2 tex_coord;
uniform vec3 offset;

varying float depthValue;

varying vec4 color;


void main(){
  	tex_coord = gl_MultiTexCoord0.st;
    gl_Position = gl_ModelViewProjectionMatrix*gl_Vertex;
    depthValue = gl_Position.z;
    color = gl_Color;
}
