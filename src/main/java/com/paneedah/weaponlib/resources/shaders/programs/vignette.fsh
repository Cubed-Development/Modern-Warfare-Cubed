#version 120

uniform sampler2D reticle;
uniform sampler2D DiffuseSampler;
uniform float Radius;

uniform float Randy;
uniform vec2 Velocity;

varying vec2 texCoord;
varying vec2 oneTexel;


uniform vec3 ConvergeX = vec3(-1.0,  0.0, 0.5);
uniform vec3 ConvergeY = vec3( 0.0, -1.0, 0.5);
uniform vec3 RadialConvergeX = vec3(1.0, 1.0, 1.0);
uniform vec3 RadialConvergeY = vec3(1.0, 1.0, 1.0);


//const float RADIUS = 0.55;

const float SOFTNESS = 0.1;

void main(){

	vec2 center = vec2(0.5, 0.5);
	vec2 realTex = texCoord-center;
   	vec2 distortedTex = cos(min((length(realTex)/(2.0)), 1.0)*3.14*0.5)*realTex+center;

	

    vec4 texColor = texture2D(DiffuseSampler, distortedTex.xy);
    
    texColor = mix(texColor, texture2D(reticle, texCoord.xy), 0.5);

    float dist = distance(texCoord.xy, vec2(0.5+Velocity.x,0.5+Velocity.y));
    float vignette = smoothstep(Radius, Radius - SOFTNESS, dist);
    
    // ADD BACK
    texColor *= vignette;
    texColor.a = 1;
    
    float scopeRad = 0.46;
    
    dist = distance(texCoord.xy, vec2(0.5,0.5));
    float mask = smoothstep(scopeRad, scopeRad - SOFTNESS, dist);
    
    
    float deconRad = smoothstep(scopeRad, (scopeRad) - 0.1, dist);
    
    float deconvergeAmount = 0.01;
   	if(deconvergeAmount != 0.0) {
        vec3 CoordX = texCoord.x * RadialConvergeX;
        vec3 CoordY = texCoord.y * RadialConvergeY;
    
        CoordX += ConvergeX * deconvergeAmount - (RadialConvergeX - 1.0) * 0.5;
        CoordY += ConvergeY * deconvergeAmount - (RadialConvergeY - 1.0) * 0.5;
        
    
        float RedValue   = texture2D(DiffuseSampler, vec2(CoordX.x, CoordY.x)).r;
        float GreenValue = texture2D(DiffuseSampler, vec2(CoordX.y, CoordY.y)).g;
        float BlueValue  = texture2D(DiffuseSampler, vec2(CoordX.z, CoordY.z)).b;
        float AlphaValue  = texture2D(DiffuseSampler, texCoord).a;
        
        
        vec4 newColor = vec4(RedValue, GreenValue, BlueValue, AlphaValue);
    
    	//texColor = mix(texColor, newColor, 1-deconRad);
        //newColor += vec4(RedValue, GreenValue, BlueValue, 1.0);
        //gl_FragColor = mix(gl_FragColor, newColor, deconvergeAmount * 100.0);
    }
    
    
    float innerVig = smoothstep(scopeRad, (scopeRad) - 0.05, dist);
    //texColor.rgb *= innerVig;
    
    
    
    if(mask < 0.3) {
       texColor.a = 0;
    } else {
    	texColor.a = 1;
    }
    
   // if(vignette < 0.3) texColor.a = 0.0;

    
    
   
    
	
	texColor.a = 1;
    gl_FragColor = texColor;
}
