#version 120

uniform sampler2D tex0;
uniform sampler2D lightmap;

varying vec2 texCoord;
varying vec2 lightmapTexCoord;
varying vec3 lightSum;
varying vec2 seCo;



varying vec3 normal;
varying vec3 eyeDir;
varying vec3 lightDir;


void main(){
    vec4 primary = texture2D(tex0, texCoord);
    vec4 light = texture2D(lightmap, lightmapTexCoord);
   	gl_FragColor = vec4(primary.rgb*lightSum, primary.a)*light;

}
