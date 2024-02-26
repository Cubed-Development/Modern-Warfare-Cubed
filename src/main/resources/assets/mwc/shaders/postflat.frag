#version 120

uniform sampler2D tex;
uniform sampler2D distortionTex;

uniform sampler2D distortionBuffer;

uniform sampler2D depthBuf;

varying vec2 tex_coord;
uniform sampler2D real;
uniform float timer;

const float mdf = 0.025;
const float exposure = 0.5;


uniform mat4 inverseProjectionMatrix;
uniform mat4 inverseViewMatrix;
uniform mat4 inv_ViewProjectionMatrix;

uniform vec3 cameraPosition;

uniform vec2 windowSize;

uniform vec3 flashlightPosition;

struct PointLight {
	float intensity;
	float radius;
	vec3 position;
};

const int NUM_OF_LIGHTS = 3;

uniform PointLight lights[NUM_OF_LIGHTS];


// Linearized depth value to be used by many shaders
float linearizedDepth;
float depthFragment;




vec4 applyFilmGrain(vec4 color) {
	 float noise = (fract(sin(dot(tex_coord, vec2(12.9898,78.233)*(2.0+timer))) * 43758.5453));
	 color -= noise*mdf;
	 return color;
}



float linearize_depth(float d,float zNear,float zFar)
{
    return zNear * zFar / (zFar + d * (zNear - zFar));
}


vec4 applyTonemapping(vec4 color) {
	vec3 editingColor = color.rgb;
	editingColor *= exposure;
	vec3 x = max(vec3(0),editingColor-0.004);
	vec3 retColor = (x*(6.2*x+.5))/(x*(6.2*x+1.7)+0.06);
	return vec4(retColor, 1);
}

vec3 WorldPosFromDepth(float depth) {

	//float z = linearize_depth(depth, 0, 1);
    float z = depth * 2.0 - 1.0;

    vec4 clipSpacePosition = vec4(tex_coord * 2.0 - 1.0, z, 1.0);
    vec4 viewSpacePosition = inverseProjectionMatrix * clipSpacePosition;

    // Perspective division
    viewSpacePosition /= viewSpacePosition.w;

    vec4 worldSpacePosition = inverseViewMatrix * viewSpacePosition;

    return worldSpacePosition.xyz;
}

vec3 worldPos(vec3 screenPos){
	vec4 ndcPos;
	ndcPos.xy = (2*screenPos.xy)/(windowSize) - 1;
	ndcPos.z = (2*screenPos.z - gl_DepthRange.near - gl_DepthRange.far)/(gl_DepthRange.far - gl_DepthRange.near);
	ndcPos.w = 1;

	vec4 worldPos = inv_ViewProjectionMatrix * ndcPos;
	return worldPos.xyz/worldPos.w;
}



vec4 applyDistortion(vec4 color) {

		vec4 bufferValue = texture2D(distortionBuffer, tex_coord);

		float depthFragment = texture2D(depthBuf, tex_coord).z;
		float linearlized = linearize_depth(depthFragment, 0.001, 100);




		vec4 distortion = texture2D(distortionTex, tex_coord + vec2(0, -timer*0.1));
		float distortionAmount = bufferValue.a/20;
		distortionAmount = min(distortionAmount, 0.01);


		return texture2D(tex, tex_coord+vec2(distortion.r-0.5, distortion.g-0.5)*distortionAmount);

}

vec3 calculate_world_position(vec2 texture_coordinate, float depth_from_depth_buffer)
{
    vec4 clip_space_position = vec4(texture_coordinate * 2.0 - vec2(1.0), depth_from_depth_buffer * 2.0 - 1.0, 1.0);

    //vec4 position = inverse_projection_matrix * clip_space_position; // Use this for view space
    vec4 position = (inv_ViewProjectionMatrix) * clip_space_position; // Use this for world space

    return(position.xyz / position.w);
}


float isPointInCone(float baseRadius, vec3 position, vec3 source, vec3 direction, float height) {

		float cone_dist = dot(position - source, direction);
		float cone_radius = (cone_dist / height) * baseRadius;
		float orth_distance = length((position - source) - cone_dist * direction);

		if(orth_distance > cone_radius) {
			return -1;
		} else {
			return orth_distance - cone_radius;
		}




}

vec4 applyAdvancedDistortion(vec4 color) {
	float depthFragment = texture2D(depthBuf, tex_coord).r;
	vec4 distortion = texture2D(distortionTex, tex_coord + vec2(0, -timer*0.02));

	vec3 worldPos = WorldPosFromDepth(depthFragment);


	for(int i = 0; i < NUM_OF_LIGHTS; ++i) {
		vec3 lightPosition = lights[i].position - cameraPosition;
		float distance = length(worldPos-lightPosition);

		if(distance < lights[i].radius) {
			color *= (1.0*lights[i].intensity) + (1.5-(distance/lights[i].radius));
		}


	}



	return color;




}

void setupDepth() {
	  depthFragment = texture2D(depthBuf, tex_coord).z;
		linearizedDepth = linearize_depth(depthFragment, 0.001, 100);
}



vec4 applyFog(vec4 color) {



		float b = 1;
    float fogAmount = 1.0 - exp( -linearizedDepth*b );

    vec4  fogColor  = vec4(0.5, 0.5, 0.5, 1.0);
    return mix( color, fogColor, fogAmount );


/*
		float a = 4.0;
		float b = 1.2;

		vec3 world = worldPos(vec3(gl_FragCoord.xy, depthFragment))-cameraPosition;


		vec3 rayDir = normalize(world);


		float distanceToThing =  length(world);

		float fogAmount = (a/b) * exp(-cameraPosition.y*b) * (1.0 - exp(-distanceToThing*rayDir.y*b))/rayDir.y;

 		if(fogAmount > 1.0) fogAmount = 1.0;

		if(fogAmount < 0.0) fogAmount = 0.0;

		fogAmount = 0;

		//fogAmount = 0;
    vec4  fogColor  = vec4(0.5,0.6,0.7, 1.0);
    return mix( color, fogColor, fogAmount );
*/

}

vec2 rand(vec2 c){
    mat2 m = mat2(12.9898,.16180,78.233,.31415);
	return fract(sin(m * c) * vec2(43758.5453, 14142.1));
}

vec2 noise(vec2 p){
	vec2 co = floor(p);
	vec2 mu = fract(p);
	mu = 3.*mu*mu-2.*mu*mu*mu;
	vec2 a = rand((co+vec2(0.,0.)));
	vec2 b = rand((co+vec2(1.,0.)));
	vec2 c = rand((co+vec2(0.,1.)));
	vec2 d = rand((co+vec2(1.,1.)));
	return mix(mix(a, b, mu.x), mix(c, d, mu.x), mu.y);
}

vec4 slightBlur(vec4 color, float amount) {

		if(amount == 0) return color;

		vec2 uv = 1/windowSize;
		vec4 baseColor = vec4(0);
		float size = 2;
		float separation = max(1.5, 1.0);

		if(size <= 0) {
			return color;
		}

		for (float i = -size; i <= size; ++i) {
	    for (float j = -size; j <= size; ++j) {
	      baseColor += texture2D(tex, tex_coord + vec2(uv.x*i, uv.y*j)*separation);
	    }
  	}

		baseColor /= pow(size * 2.0 + 1.0, 2.0);




		return baseColor;
}

/**
// Author: Élie Michel
// License: CC BY 3.0
// July 2017
**/

vec4 raindrop(vec4 color, vec2 c) {
	vec2 u = c / windowSize.xy,
			 v = (c*.1)/ windowSize.xy,
			 n = noise(v*200.); // Displacement




			 // Loop through the different inverse sizes of drops
	for (float r = 3 ; r > 0. ; r--) {
			vec2 x = windowSize.xy * r * .01,  // Number of potential drops (in a grid)
					 p = 6.28 * u * x + (n - .5) * 2.,
					 s = sin(p);

			// Current drop properties. Coordinates are rounded to ensure a
			// consistent value among the fragment of a given drop.
			//vec4 d = texture(iChannel1, round(u * x - 0.25) / x);
			vec2 v = floor(u * x + 0.25) / x;
			vec4 d = vec4(noise(v*200.), noise(v));

			// Drop shape and fading
			float t = (s.x+s.y) * max(0., 1. - fract((timer *0.01) * (d.b + .1) + d.g) * 2.);;

			// d.r -> only x% of drops are kept on, with x depending on the size of drops
			if (d.r < (5.-r)*.08 && t > .5) {
					// Drop normal
					// vec3 v = normalize(-vec3(cos(p), mix(.2, 1., t-.5)));
					// fragColor = vec4(v * 0.5 + 0.5, 1.0);  // show normals

					// Poor man's refraction (no visual need to do more)
				//	color /= 4;
				//	color += texture2D(tex, c + vec2(u.x, u.y))*0.25;



				//	color = texture2D(tex, u - v.xy * .3)*0.2 + color*0.8;
					//color = slightBlur(color, 1.0) * 0.9 + texture2D(tex, u - v.xy * .3) * 0.1;
					color = vec4(1, 1, 1, 0.1);
			}
	}

	return color;


}







void main(){


	// Load primary color
	vec4 primary = texture2D(tex, tex_coord);

	// Correct for horizon


	setupDepth();



	//primary = applyTonemapping(primary);

	primary = applyDistortion(primary);
		primary = applyFog(primary);

	if(primary.a == 0) {
		primary.a = 1;
	}
	//primary = applyAdvancedDistortion(primary);

	primary = raindrop(primary, gl_FragCoord.xy);

	//primary = slightBlur(primary);

	// Apply film grain as the final effect
	primary = applyFilmGrain(primary);

	//gl_FragColor = texture2D(distortionBuffer, tex_coord);
	gl_FragColor = primary;






}
