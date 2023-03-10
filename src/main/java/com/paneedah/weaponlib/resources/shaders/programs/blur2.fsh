#version 120

uniform float BlurEnabled;

uniform sampler2D DiffuseSampler;

varying vec2 texCoord;
varying vec2 oneTexel;

uniform vec2 InSize;

uniform vec2 BlurDir;
uniform float Radius;
uniform float Progress;

uniform float BlurVignetteRadius;

const float SOFTNESS = 0.25;

void main() {

    vec4 texColor = texture2D(DiffuseSampler, texCoord.xy);
    
    if(BlurEnabled == 0.0) {
        gl_FragColor = texColor;
        return;
    }
    
    vec4 blurredColor = texColor;

    float dist = distance(texCoord.xy, vec2(0.5,0.5));

    float blurVignette = smoothstep(BlurVignetteRadius, BlurVignetteRadius - SOFTNESS, dist);

    vec4 blurred = vec4(0.0);
    float totalStrength = 0.0;
    float totalAlpha = 0.0;
    float totalSamples = 0.0;

    for(float r = -Radius; r <= Radius; r += 1.0) {
        vec4 sample = texture2D(DiffuseSampler, texCoord + oneTexel * r * BlurDir);

        // Accumulate average alpha
        totalAlpha = totalAlpha + sample.a;
        totalSamples = totalSamples + 1.0;

        // Accumulate smoothed blur
        float strength = 1.0 - abs(r / Radius);
        totalStrength = totalStrength + strength;
        blurred = blurred + sample;
    }

    blurredColor = vec4(blurred.rgb / (Radius * 2.0 + 1.0), totalAlpha);

    vec4 mixColor = mix(blurredColor, texColor, blurVignette);
    mixColor = mix(texColor, mixColor, Progress);

    //gl_FragColor = mixColor;
    gl_FragColor = vec4(mixColor.rgb, 1.0);
}
