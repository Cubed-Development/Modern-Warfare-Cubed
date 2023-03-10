#version 120

uniform sampler2D tex0;
uniform sampler2D lightmap;

varying vec2 texCoord;
varying vec2 lightmapTexCoord;
varying vec3 lightSum;

uniform float lightIntensity = 0;

varying vec3 normal;
varying vec3 eyeDir;
varying vec3 lightDir;

uniform sampler2D skin;
uniform bool useSkin;

uniform bool disabled;

uniform float time;

vec3 blendOverlay(vec3 base, vec3 blend) {
    return mix(1.0 - 2.0 * (1.0 - base) * (1.0 - blend), 2.0 * base * blend, step(base, vec3(0.5)));
}

float blendColorDodge(float base, float blend) {
	return (blend==1.0)?blend:min(base/(1.0-blend),1.0);
}

vec3 blendColorDodge(vec3 base, vec3 blend) {
	return vec3(blendColorDodge(base.r,blend.r),blendColorDodge(base.g,blend.g),blendColorDodge(base.b,blend.b));
}

vec3 blendColorDodge(vec3 base, vec3 blend, float opacity) {
	return (blendColorDodge(base, blend) * opacity + base * (1.0 - opacity));
}

vec4 overlay(vec4 one, vec4 two) {
	return vec4(blendOverlay(one.rgb, two.rgb), 1.0);
}


void main(){

   	float dist = length(texCoord);


	vec4 primary = texture2D(tex0, texCoord);
	
	if(useSkin) {
		vec4 skin = texture2D(skin, texCoord*2);
		primary.rgb = blendColorDodge(primary.rgb, skin.rgb);
	}
	

	
	
	
	
	vec4 orange = vec4(0.97, 0.81, 0.34, 0.1);

	vec4 shininess = vec4(1.0, 0.0, 0.0, 0.0);
	vec4 specular = vec4(1.0, 0.0, 0.0, 0.0);
	vec4 spec = vec4(0.0);

	 vec3 n = normalize(normal);
    vec3 l = normalize(lightDir);
    vec3 e = normalize(eyeDir);

    float intensity = max(dot(n,l), 0.0);
    if (intensity > 0.0) {
        vec3 h = normalize(l + e);
        float intSpec = max(dot(h,n), 0.0);
      //  spec = specular * pow(intSpec, shininess);
    }

    //https://www.lighthouse3d.com/tutorials/glsl-tutorial/point-lights/

    vec4 light = texture2D(lightmap, lightmapTexCoord);

    vec4 flash = vec4((orange*intensity*lightIntensity).rgb, primary.a)*(1-light)*1.5;
	flash *= 1.5;
	
	
	
	gl_FragColor = vec4(primary.rgb*lightSum, primary.a)*light+ flash;
	
	if(disabled) {
		gl_FragColor.r *= 3.0;
		gl_FragColor.a = 0.5;
	}

}
