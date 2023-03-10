#version 120

uniform sampler2D tex;
varying vec2 tex_coord;
varying vec4 color;
varying vec4 pos;
varying vec4 rawPos;

uniform float zoom;

float grid(vec2 st, float res)
{
  vec2 grid = fract(st*res);
  return (step(res,grid.x) * step(res,grid.y));
}
 
 //https://madebyevan.com/shaders/grid/
void main()
{

	 vec2 coord = tex_coord.xy*20;

  // Compute anti-aliased world-space grid lines
  vec2 grid = abs(fract(coord - 0.5) - 0.5) / fwidth(coord);
  float line = min(grid.x, grid.y);

	float thickness = 0.6;

  // Just visualize the grid lines directly
  float color = thickness - min(line, thickness);

  // Apply gamma correction
  color = pow(color, 1.0 / 2.2);
  gl_FragColor = vec4(vec3(color), 1.0);
  if(gl_FragColor.rgb == vec3(0, 0, 0)) {
  	gl_FragColor = vec4(0);
  }
    
}
