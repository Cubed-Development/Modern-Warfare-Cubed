#version 120

/*
* __          __        _     _  _____ _               _
 \ \        / /       | |   | |/ ____| |             | |
  \ \  /\  / /__  _ __| | __| | (___ | |__   __ _  __| | ___ _ __
   \ \/  \/ / _ \| '__| |/ _` |\___ \| '_ \ / _` |/ _` |/ _ \ '__|
    \  /\  / (_) | |  | | (_| |____) | | | | (_| | (_| |  __/ |
     \/  \/ \___/|_|  |_|\__,_|_____/|_| |_|\__,_|\__,_|\___|_|
    by Cpt. James R. Holden of the Rocinante, 2022
*
*/


// Default texture
uniform sampler2D tex;
varying vec2 tex_coord;

// Fog parameters
uniform float fogIntensity;
uniform vec3 baseFogColor;


// Light things & stuff
uniform int totalActiveLights;
const int NUM_OF_LIGHTS = 32;

struct PointLight {
  vec3 attenuation;
  vec3 baseColor;
  vec3 position;
};
uniform PointLight lights[NUM_OF_LIGHTS];

// Depth parameters
uniform sampler2D depthBuf;
float depthFragment;
float linearizedDepth;



// uniforms for the lights
uniform vec3 cameraPosition;
uniform mat4 inverseProjectionMatrix;
uniform mat4 inverseViewMatrix;


/*
* Linearizes the depth buffer (stored as a logarithmic
* function typically for higher precision close up)
*/
float linearize_depth(float d,float zNear,float zFar)
{
    return zNear * zFar / (zFar + d * (zNear - zFar));
}

/*
* Initializes depth parameters so the shader
* doesn't have to re-compute them often.
*/
void setupDepth() {
  depthFragment = texture2D(depthBuf, tex_coord).z;
  linearizedDepth = linearize_depth(depthFragment, 0.01, 100);
}

/*
* Simple fog from Inigo Quilez's phenomenal blog
* [https://iquilezles.org/articles/fog/]
*/
vec4 applyFog(vec4 color) {
    float fogAmount = 1.0 - exp( -linearizedDepth*fogIntensity );
    vec4  fogColor  = vec4(baseFogColor, 1.0);
    return mix( color, fogColor, fogAmount );
}

/*
* Gets the world position from the depth fragment value
* [https://stackoverflow.com/questions/32227283/getting-world-position-from-depth-buffer-value]
*/
vec3 WorldPosFromDepth(float depth) {

    // Converts from [0,1] depth value to NDC clip space value [-1, -1]
    // [https://learnopengl.com/Getting-started/Coordinate-Systems]
    float z = depth * 2.0 - 1.0;

    vec4 clipSpacePosition = vec4(tex_coord * 2.0 - 1.0, z, 1.0);
    vec4 viewSpacePosition = inverseProjectionMatrix * clipSpacePosition;

    // Perspective division
    viewSpacePosition /= viewSpacePosition.w;

    // Turn into world space by applying the inverse of the
    // view matrix
    vec4 worldSpacePosition = inverseViewMatrix * viewSpacePosition;

    return worldSpacePosition.xyz;
}

/*
* Applies world lighting with the current depthFragment
* value as the input
*/
vec4 applyWorldLights(vec4 color) {
    vec3 worldPos = WorldPosFromDepth(depthFragment);

    // Loops only through active lights
    for(int i = 0; i < totalActiveLights; ++i) {
      PointLight light = lights[i];
      vec3 lightPosition = light.position - cameraPosition;
      float distance = length(worldPos-lightPosition);


      // This uses a variation of proper lighting calculation, as in
      // Minecraft we do not actually have access to stuff like a specular
      // texture sadly.
      float attenuation = 1.0 / (light.attenuation.x + light.attenuation.y * distance + light.attenuation.z*(distance*distance));

      // Applies it according to the light color values.
      color.r += color.r*attenuation*light.baseColor.r;
      color.g += color.g*attenuation*light.baseColor.g;
      color.b += color.b*attenuation*light.baseColor.b;
    }
    return color;
}





void main() {

  /*
  * Applies all the rendering effects
  * Depth Setup -> World Lighting -> Fog
  */
  setupDepth();

  // Sample initial color
  vec4 primaryColor = texture2D(tex, tex_coord);

  // Apply world lighting
  primaryColor = applyWorldLights(primaryColor);

  // Apply fog effects
  primaryColor = applyFog(primaryColor);



	gl_FragColor = primaryColor;
}
