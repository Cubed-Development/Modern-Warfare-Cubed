#version 120

uniform sampler2D tex0;

varying vec2 texCoord;
uniform bool bloom;
uniform bool natural;

uniform float timer;

uniform sampler2D fbm[5];

uniform sampler2D cloud;

vec3 blendOverlay(vec3 base, vec3 blend) {
    return mix(1.0 - 2.0 * (1.0 - base) * (1.0 - blend), 2.0 * base * blend, step(base, vec3(0.5)));
    // with conditionals, may be worth benchmarking
    // return vec3(
    //     base.r < 0.5 ? (2.0 * base.r * blend.r) : (1.0 - 2.0 * (1.0 - base.r) * (1.0 - blend.r)),
    //     base.g < 0.5 ? (2.0 * base.g * blend.g) : (1.0 - 2.0 * (1.0 - base.g) * (1.0 - blend.g)),
    //     base.b < 0.5 ? (2.0 * base.b * blend.b) : (1.0 - 2.0 * (1.0 - base.b) * (1.0 - blend.b))
    // );
}

vec4 overlay(vec4 one, vec4 two) {
	return vec4(blendOverlay(one.rgb, two.rgb), 1.0);
}
void main(){


	float baseSpeed = 0.1;
	
	vec4 primary = texture2D(fbm[0], texCoord + vec2(timer*0.0001*baseSpeed, 0));
	primary = overlay(primary, texture2D(fbm[1], texCoord + vec2(timer*0.001*baseSpeed, 0)));
	primary = overlay(primary, texture2D(fbm[2], texCoord + vec2(timer*0.001*baseSpeed, 0)));
	primary = overlay(primary, texture2D(fbm[3], texCoord + vec2(timer*0.001*baseSpeed, 0)));
	primary = overlay(primary, texture2D(fbm[4], texCoord + vec2(timer*0.005*baseSpeed, 0)));
	
	

	//primary.rgb /= 2;

	gl_FragColor = primary;
}
