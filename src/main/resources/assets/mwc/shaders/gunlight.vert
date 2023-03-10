#version 120

varying vec2 texCoord;
varying vec2 lightmapTexCoord;
varying vec3 lightSum;

uniform float lightIntensity;


varying vec3 normal;
varying vec3 eyeDir;
varying vec3 lightDir;

uniform float time;
uniform bool disabled;

float rand(vec2 co){
    return fract(sin(dot(co, vec2(12.9898, 78.233))) * 43758.5453);
}

void main(){
    texCoord = gl_MultiTexCoord0.st;
    
    
   

    if(disabled) {
    	 gl_Position = gl_ModelViewProjectionMatrix * (gl_Vertex);
    	 gl_Position += vec4(rand(vec2(time + gl_Vertex.x, time + gl_Vertex.y))*0.05, rand(vec2(time + gl_Vertex.x, -time + gl_Vertex.z))*0.05, 0, 0);
    
    } else {
    	 gl_Position = gl_ModelViewProjectionMatrix * gl_Vertex;
   	}
    
    
    lightmapTexCoord = (gl_TextureMatrix[1] * gl_MultiTexCoord1).xy;
    
    // calc lighting
    normal = (gl_NormalMatrix * gl_Normal).xyz;
	vec4 totalLight = vec4(0.0F);

	for (int i = 0; i < gl_MaxLights; i ++){
		
		vec4 diffuse = gl_FrontLightProduct[i].diffuse * max(dot(normal,gl_LightSource[i].position.xyz), 0.0f);
		diffuse = clamp(diffuse, 0.0F, 1.0F);     
		
		totalLight += diffuse + gl_FrontLightProduct[i].ambient;
	}
	lightSum = clamp((totalLight + gl_LightModel.ambient).rgb, 0.0F, 1.0F);
	
	// sussus
	
	if(lightIntensity != 0) {
		vec4 pos = gl_Position;
 		vec4 l_pos = vec4(0.2, -2, -13, 0.0);
 		//vec4 l_pos = vec4(1, 1, 0, 0);
 		
 		//l_pos *= gl_ModelViewProjectionMatrix;
 
   // normal = normalize(normal);
    lightDir = vec3(l_pos - pos);
    eyeDir = vec3(-pos);
	
	}
	
	
}