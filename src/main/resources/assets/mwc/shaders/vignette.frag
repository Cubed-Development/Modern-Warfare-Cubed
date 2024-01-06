#version 120

uniform sampler2D reticle;
uniform sampler2D tex0;
uniform sampler2D dirt;
uniform sampler2D holo;
uniform mat4 projection;


uniform float Radius;
uniform float reticleZoom = 1.0;


uniform vec3 ConvergeX = vec3(-1.0,  0.0, 0.5);
uniform vec3 ConvergeY = vec3( 0.0, -1.0, 0.5);
uniform vec3 RadialConvergeX = vec3(1.0, 1.0, 1.0);
uniform vec3 RadialConvergeY = vec3(1.0, 1.0, 1.0);
uniform vec2 Velocity;


uniform float texScale = 0.05;
uniform float radius = 0.1;
uniform float time;
uniform bool isNightVisionOn;
uniform bool useWhitePhosphor;

const float PI = 3.14;
const vec3 NV_LUMINOSITY_VEC = vec3(0.30, 0.59, 0.11);
const float NIGHTVISION_NOISE_AMP = 4.0;
const float NV_INTENSITY_ADJUST = 20.0;
const float NV_CONTRAST = 0.8;
const float SOFTNESS = 0.1;


varying vec4 posi;
varying vec3 normal;
varying vec3 tangent;
varying vec2 texCoord;
varying vec2 oneTexel;

vec4 radialSplit(float deconvergent) {
    vec3 CoordX = texCoord.x * RadialConvergeX;
    vec3 CoordY = texCoord.y * RadialConvergeY;

    CoordX += ConvergeX * deconvergent - (RadialConvergeX - 1.0) * 0.5;
    CoordY += ConvergeY * deconvergent - (RadialConvergeY - 1.0) * 0.5;

    float RedValue = texture2D(tex0, vec2(CoordX.x, CoordY.x)).r;
    float GreenValue = texture2D(tex0, vec2(CoordX.y, CoordY.y)).g;
    float BlueValue = texture2D(tex0, vec2(CoordX.z, CoordY.z)).b;
    float AlphaValue = texture2D(tex0, texCoord).a;

    return vec4(RedValue, GreenValue, BlueValue, 1.0);
}

float getDistSmooth(vec2 center, float rad, float soft) {
	float dist = distance(texCoord.xy, center);
   	return smoothstep(rad, rad - soft, dist);
}

vec2 getReticleCoords() {
    vec3 cameraDir = normalize(posi.xyz);
	vec3 offset = cameraDir + normal;
	mat3 mat = mat3(tangent, cross(normal, tangent), normal);
	offset = mat * offset;
	vec2 uv = offset.yx / texScale;
	return uv;
}

float getNSingle(float timer) {
    return (fract(sin(dot(texCoord, vec2(12.9898, 78.233) * (2.0 + timer))) * 43758.5453));
}

vec2 getNoise(float timer) {
    return vec2(getNSingle(timer), getNSingle(timer));
}

vec4 doNightVision(vec4 color) {
    // Apply noise to night-vision
    vec2 uv;
    uv.x = 0.35 * sin(time * 10);
    uv.y = 0.35 * cos(time * 10);
    vec2 noise = getNoise(time) * NIGHTVISION_NOISE_AMP;
    color.xy += noise.xy * 0.005;

    // Find color intensity
    float intensity = dot(NV_LUMINOSITY_VEC, color.rgb);
    intensity = clamp(NV_CONTRAST * (intensity - 0.5) + 0.5, 0.0, 1.0);
    float colorComponent = clamp(intensity / 0.59, 0.0, 1.0) * NV_INTENSITY_ADJUST;

    // Modify the color
    vec4 visionColor;
    if (useWhitePhosphor) {
        visionColor = vec4(colorComponent * 0.7, colorComponent * 0.7, colorComponent, 1.0);
    } else {
        visionColor = vec4(colorComponent * 0.7, colorComponent, colorComponent * 0.7, 1.0);
    }

    // Mix base color and use visionColor as a filter (?)
    float gray = dot(color.rgb, vec3(0.299, 0.587, 0.114));
    vec4 grayColor = vec4(gray, gray, gray, 1.0);
    color = grayColor * visionColor;

    return color;
}

void main() {
    vec2 uv = getReticleCoords();

    // calculate the distorted texture coordinates
    vec2 center = vec2(0.5, 0.5);
    vec2 realTex = texCoord - center;
    vec2 distortedTex = cos(min((length(realTex) / (1.5)), 1.0) * PI * 0.5) * realTex + center;
    vec4 grime = texture2D(dirt, texCoord);

    vec4 newColor = vec4(0);

    vec4 original = texture2D(tex0, distortedTex);

    float borderRGB = getDistSmooth((uv * vec2(1.1, 1.0)) + vec2(0.5, 0.5), 10.0, 4);
    newColor = mix(original, radialSplit(0.001), 1 - borderRGB);

    vec2 distortedTexBorder = cos(min((length(realTex) / (0.9)), 1.0) * PI * 0.5) * (uv);

    vec4 newReticleColor = texture2D(reticle, (distortedTexBorder + (Velocity * 0.2)) * 0.05 * reticleZoom + center);

    newColor = mix(newColor, newReticleColor, newReticleColor.a);
    vec4 holoColor = texture2D(holo, uv + vec2(0.5, 0.5));

    if (isNightVisionOn) newColor = doNightVision(newColor);
    float border = distance(texCoord.xy, (uv * vec2(1.1, 1.0)) + vec2(0.5, 0.5));
    if (border > 9) newColor.rgb = vec3(0);


    newColor += grime * (1 - length(newColor)) / 2;

    newColor.b *= 0.9;
    newColor.rg *= 0.8;

    // add scope shadow
    float rad = 0.5;
    float dist = distance(texCoord.xy, vec2(0.5 + Velocity.x, 0.5 + Velocity.y));
    float vignette = smoothstep(rad, rad - SOFTNESS, dist);

    newColor *= vignette;

    // overlay the scope radius
    float scopeRad = 0.46;
    dist = distance(texCoord.xy, vec2(0.5, 0.5));
    float mask = smoothstep(scopeRad, scopeRad - SOFTNESS, dist);
    if (mask == 0) {
        newColor.a = 0;
    } else
        newColor.a = 1;

    gl_FragColor = newColor;
}