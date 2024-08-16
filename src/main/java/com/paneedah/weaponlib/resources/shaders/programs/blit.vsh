#version 120

attribute vec4 Position;

uniform mat4 ProjMat;
uniform vec2 OutSize;

varying vec2 texCoord;
varying vec4 outPos;
varying float zzz;

void main(){
    outPos = ProjMat * vec4(Position.xyz, 1.0);
    zzz = Position.z;
    gl_Position = vec4(outPos.xy, 0.2, 1.0);

    texCoord = Position.xy / OutSize;
    texCoord.y = 1.0 - texCoord.y;
}
