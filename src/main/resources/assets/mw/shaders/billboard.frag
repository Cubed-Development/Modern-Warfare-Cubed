#version 120

uniform sampler2D tex;
uniform sampler2D depthTex;
varying vec2 tex_coord;

varying float depthValue;

uniform vec2 viewportSize;
varying vec4 color;

float linearize_depth(float d,float zNear,float zFar)
{
    return zNear * zFar / (zFar + d * (zNear - zFar));
}


void main(){

	vec4 primary = texture2D(tex, tex_coord);
	primary.a *= color.a;

	//primary = vec4(1, 0, 0, 1);
	vec2 coords = (1/viewportSize) * gl_FragCoord.xy;
	//https://github.com/keaukraine/webgl-buddha/blob/master/js/app/SoftDiffuseColoredShader.js#L22
	float geometryZ = linearize_depth(texture2D(depthTex, coords).r, 0.01, 100);
	float sceneZ = linearize_depth(gl_FragCoord.z, 0.01, 100);
  float a = clamp((geometryZ - sceneZ), 0.0, 1.0);
	float b = smoothstep(0.0, 0.7, a);

/*
	float depthFragment = texture2D(depthTex, coords).z;
	float linearlized = linearize_depth(depthFragment, 0.001, 100);
	gl_FragColor = vec4(vec3(linearlized), 1.0);
*/
	gl_FragColor = primary*b;
/*
	float depthFragment = texture2D(depthTex, coords).z;
	float linearlized = linearize_depth(depthFragment, 0.001, 100);


	float linearDepthValue = linearize_depth(depthValue, 0.001, 100);

	float a = clamp(linearlized - linearDepthValue, 0.0, 1.0);
	float b = smoothstep(0.0, 0.08, a);

	primary *= b;
	//primary.a = abs(linearlized-linearDepthValue);



//	primary.a += 0.2;
	//primary.a *= 0.5;
	gl_FragColor = primary;
//	gl_FragColor += texture2D(tex, tex_coord);
*/


}
