#version 120

uniform vec2 texel;
uniform sampler2D tex;
uniform sampler2D depth;

varying vec2 tex_coord;
uniform vec2 res;

float LinearizeDepth(float depth) 
{
 float near = 0.01;
 float far = 1;
    float z = depth * 2.0 - 1.0; // back to NDC 
    return (2.0 * near * far) / (far + near - z * (far - near));	
}

vec4 blur13(sampler2D image, vec2 uv, vec2 resolution, vec2 direction) {
  vec4 color = vec4(0.0);
  vec2 off1 = vec2(1.411764705882353) * direction;
  vec2 off2 = vec2(3.2941176470588234) * direction;
  vec2 off3 = vec2(5.176470588235294) * direction;
  color += texture2D(image, uv) * 0.1964825501511404;
  color += texture2D(image, uv + (off1 / resolution)) * 0.2969069646728344;
  color += texture2D(image, uv - (off1 / resolution)) * 0.2969069646728344;
  color += texture2D(image, uv + (off2 / resolution)) * 0.09447039785044732;
  color += texture2D(image, uv - (off2 / resolution)) * 0.09447039785044732;
  color += texture2D(image, uv + (off3 / resolution)) * 0.010381362401148057;
  color += texture2D(image, uv - (off3 / resolution)) * 0.010381362401148057;
  return color;
}

void main(){

	float led = LinearizeDepth(texture2D(depth, tex_coord).z);
	vec4 depth = texture2D(depth, tex_coord)*led;


	vec4 blurColor = blur13(tex, tex_coord, res, vec2(0, 1));
	
	for(float r = 0; r < 10; r += 0.5) {
		blurColor = blur13(tex, tex_coord, res, vec2(r/5, 0));
		blurColor = blur13(tex, tex_coord, res, vec2(0, r/5));
	}

	if(depth.z < 0.09 && depth.z > 0.082) {
		depth.z *= 10;
	}

	//gl_FragColor = depth;
	gl_FragColor = mix(texture2D(tex, tex_coord), blurColor, 1-depth.z);
}