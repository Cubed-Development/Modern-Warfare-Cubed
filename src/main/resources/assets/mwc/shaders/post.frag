#version 120

/*
*  _____          _      _____ _               _
 |  __ \        | |    / ____| |             | |
 | |__) |__  ___| |_  | (___ | |__   __ _  __| | ___ _ __
 |  ___/ _ \/ __| __|  \___ \| '_ \ / _` |/ _` |/ _ \ '__|
 | |  | (_) \__ \ |_   ____) | | | | (_| | (_| |  __/ |
 |_|   \___/|___/\__| |_____/|_| |_|\__,_|\__,_|\___|_|
 by Cpt. James R. Holden of the Rocinante, 2022
 (always wanted to do this.)
*
*/

// Default texture
uniform sampler2D tex;
varying vec2 tex_coord;

// Distortion FX
uniform sampler2D distortionTex;
uniform sampler2D distortionBuffer;

// Incremental value for timed
// fx (i.e. moving distortion texture)
uniform float timer;

// Blending factor for the noise
uniform float mdf = 0.025;

// Contains all the rain/snow to be rendered
uniform sampler2D rainBuf;

// Inverted window size (ex. 1.0/1920 x 1.0/1080)
uniform vec2 windowSize;

// Tells the shader if it should do
// snow or rain FX.
uniform bool isSnow;

// Should do screen rain/snow
uniform bool onScreenLiquids;

uniform bool enableFilmGrain;

// oldPost

uniform bool flashed;
uniform float brightness;

const float CONTRAST = 0.8;
uniform bool nightVision;
uniform float time;
uniform sampler2D noiseSampler; // ! TODO: Generating noise is probably faster right?
uniform float noiseAmplification;
uniform float intensityAdjust;

const float SOFTNESS = 0.25;
uniform bool vignette;
uniform float vignetteRadius;

uniform float sepiaRatio;
uniform vec3 sepiaColor;

varying vec2 texCoord;

/*
*  Applies a film grain effect, using the current fragment as
*  the basis for the changes
*/
vec4 applyFilmGrain(vec4 color) {
    float modTimer = mod(timer, 100.0);
    float noise = (fract(sin(dot(tex_coord, vec2(12.9898, 78.233) * (2.0 + modTimer))) * 43758.5453));
    color -= noise * mdf;
    color.a = 1;
    return color;
}


/*
* Should be the first effect called, gets the fragment
* according to the depth buffer & depth texture.
*/
vec4 applyDistortion() {

    vec4 bufferValue = texture2D(distortionBuffer, tex_coord);

    // This moves the texture vertically, 0.1 was used to slow this down
    vec4 distortion = texture2D(distortionTex, tex_coord + vec2(0, -timer * 0.1));

    // Distorts according to the buffer's alpha value
    float distortionAmount = bufferValue.a / 20;
    distortionAmount = min(distortionAmount, 0.02);


    return texture2D(tex, tex_coord + vec2(distortion.r - (distortion.g * 0.5), distortion.g - (distortion.r * 0.5)) * distortionAmount);

}

/*
* Pseudo-random function by Élie Michel
* [https://www.shadertoy.com/view/MlfBWr]
*/
vec2 rand(vec2 c) {
    mat2 m = mat2(12.9898, .16180, 78.233, .31415);
    return fract(sin(m * c) * vec2(43758.5453, 14142.1));
}

/*
* Applies a blur effect by sampling around the current
* fragment. This uses the 'fast box blur' technique.
*/
vec4 slightBlur(vec4 color, float size, float separation, vec2 distortion) {


    if (separation == 0 || size <= 0) return color;

    vec4 baseColor = vec4(0);

    // Allows us to offset by a single fragment
    vec2 uv = windowSize;

    // Ensure separation is at least 1
    separation = max(1.0 + separation, 1.0);


    for (float i = -size; i <= size; ++i) {
        for (float j = -size; j <= size; ++j) {
            baseColor += vec4(texture2D(tex, tex_coord + vec2(uv.x * i, uv.y * j) * separation + distortion).rgb, 1.0);
        }
    }

    // Takes the average
    baseColor /= pow(size * 2.0 + 1.0, 2.0);

    return baseColor;
}





/*
* Overlays rain effect on screen
*/
vec4 handleRain(vec4 mainColor) {

    // Samples the rain buffer
    vec4 rainBuf = texture2D(rainBuf, tex_coord);

    // Blurs sample while distorting it
    mainColor = slightBlur(mainColor, 1, rainBuf.a, vec2(windowSize.x * rainBuf.a * 3, windowSize.y * rainBuf.a * 3));

    // Makes rain drops more visible
    mainColor += 0.05f * rainBuf.a;

    return mainColor;
}

/*
* Overlays snow effect on screen
*/
vec4 handleSnow(vec4 mainColor) {
    vec4 rainBuf = texture2D(rainBuf, tex_coord);
    mainColor = slightBlur(mainColor, 1, rainBuf.a, vec2(0));
    return mainColor + rainBuf.a * 0.05;
}

vec4 oldPost(vec4 mainColor) {
    if (flashed) {
        const vec3 white = vec3(1.0, 1.0, 1.0);
        float clampedBrightness = clamp(brightness / 100, 0.0, 1.0);
        float whiteBalance = 1.0 - clampedBrightness;
        mainColor.rgb = mix(white * 3, mainColor.rgb * brightness, whiteBalance);
    } else {
        mainColor.rgb *= brightness;
    }

    if (nightVision) {
        vec2 uv;
        uv.x = 0.35 * sin(time * 10);
        uv.y = 0.35 * cos(time * 10);
        vec3 noise = texture2D(noiseSampler, texCoord.xy + uv).rgb * noiseAmplification;
        mainColor.xy += noise.xy * 0.005;
    }

//    if (vignette) {
//        float dist = distance(texCoord.xy, vec2(0.5, 0.5));
//        float vignette = smoothstep(vignetteRadius, vignetteRadius - SOFTNESS, dist);
//        mainColor.rgb *= vignette;
//        mainColor.a = 1.0;
//    }

    if (nightVision) {
        const vec3 lumvec = vec3(0.30, 0.59, 0.11);
        float intensity = dot(lumvec, mainColor.rgb);
        intensity = clamp(CONTRAST * (intensity - 0.5) + 0.5, 0.0, 1.0);
        float green = clamp(intensity / 0.59, 0.0, 1.0) * intensityAdjust;
        vec4 visionColor = vec4(green * 0.7, green, green * 0.7, 1.0);
        float gray = dot(mainColor.rgb, vec3(0.299, 0.587, 0.114));
        vec4 grayColor = vec4(gray, gray, gray, 1.0);
        mainColor = grayColor * visionColor;
    }

    if (sepiaRatio > 0) {
        float gray = dot(mainColor.rgb, vec3(0.299, 0.587, 0.114));
        vec4 sepiaColorMixed = vec4(vec3(gray) * sepiaColor, 1.0);
        mainColor = mix(mainColor, sepiaColorMixed, sepiaRatio);
    }

    return mainColor;
}

void main() {

/*
	* There are several steps to process, in this order:
	* Distortion -> Rain -> Film Grain
	*/



    // Looks up primary while applying disortion
    vec4 primary = applyDistortion();


    if (onScreenLiquids) {
        // Apply rain & snow effects
        if (!isSnow) {
            primary = handleRain(primary);
        } else {
            primary = handleSnow(primary);
        }
    }

    primary = oldPost(primary);

    // Apply film grain as the final effect
    if (enableFilmGrain) primary = applyFilmGrain(primary);

    gl_FragColor = primary;
}
