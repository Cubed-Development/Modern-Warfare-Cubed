#version 120

const float[] gauss = float[](0.197448, 0.174697, 0.120999, 0.065602, 0.02784, 0.009246, 0.002403, 0.000489);

uniform sampler2D texture;
uniform sampler2D depth;
uniform float frag_height;

varying vec2 tex_coord;

float LinearizeDepth(float depth) 
{
 float near = 0.01;
 float far = 1;
    float z = depth * 2.0 - 1.0; // back to NDC 
    return (2.0 * near * far) / (far + near - z * (far - near));	
}

void main(){
	vec4 final_color = vec4(0.0);
	for(int i = 0; i < gauss.length()*2-1; i ++){
		int place = i-gauss.length()+1;
		final_color += gauss[int(abs(float(place)))]*texture2D(texture, tex_coord + vec2(0, frag_height*place));
	}
	
	float led = LinearizeDepth(texture2D(depth, tex_coord).z);
	vec4 depthN = texture2D(depth, tex_coord)*led;
	
	if(depthN.z > 0.23) {
		depthN.z = 1;
	}
	
	if(depthN.z < 0.1) {
		depthN.z = 1;
	}
	
	gl_FragColor = mix(final_color, texture2D(texture, tex_coord), depthN.z);
}