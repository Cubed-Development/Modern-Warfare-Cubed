#version 120

varying vec3 tex_coord;
varying vec2 texCoord;

uniform mat4 view;
uniform mat4 projection;

void main(){
	texCoord = gl_MultiTexCoord0.st;
	tex_coord = gl_Vertex.xyz;
	mat4 view2 = mat4(mat3(view));
	gl_Position = projection * view2 * vec4(gl_Vertex.xyz, 1);
}