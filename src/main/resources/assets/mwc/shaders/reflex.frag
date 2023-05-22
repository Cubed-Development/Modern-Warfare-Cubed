#version 120

uniform sampler2D ret;
uniform sampler2D tex0;

varying vec2 texCoord;

uniform float texScale = 0.05;
uniform float radius = 0.1;

uniform vec3 background;

varying vec4 posi;

uniform bool isBloom;


varying vec3 normal;
varying vec3 tangent;



varying vec4 my_FragData[2];

void main(){




	vec3 cameraDir = normalize(posi.xyz);

	vec3 offset = cameraDir + normal;

	mat3 mat = mat3(tangent,
	 cross(normal, tangent),
	  normal);
	offset = mat*offset;

	vec2 uv = offset.yx/texScale;


	//gl_FragColor = vec4(0.0, 0.0, 0.2, 0.1) + texture2D(ret, uv + vec2(0.5, 0.5));
	vec4 retColor = texture2D(ret, uv + vec2(0.55, 0.5));
	if(!isBloom) {
		if(retColor.a > 0.2) {
		
			retColor *= 3;
			gl_FragColor = retColor;
		} else {
			gl_FragColor = vec4(background, 0.2);

		}

		float dist = distance(texCoord.xy, vec2(0.475, 0.12));
		if(dist > radius) gl_FragColor.a = 0;
	} else {
		if(retColor.a > 0.2) {
			gl_FragColor = retColor;
			gl_FragColor.a = 1;
		}
	}



//	gl_FragData[1] = vec4(0);
}
