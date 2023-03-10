#version 120

uniform sampler2D tex;
uniform sampler2D select;
varying vec2 tex_coord;

uniform vec2 fragSize;
uniform int idSelected;

const vec4 highlightColor = vec4(0, 0.824, 0.827, 1.0);
const int searchRadius = 1;
const float mixFactor = 0.2;

bool isSelectedColor(vec4 color) {
	return abs(color.r - (idSelected/255.0)) < 0.001;
}

vec4 search(vec4 originalColor) {





	bool notSelected = isSelectedColor(originalColor);

	vec4 col = vec4(0);
	for(int y = -searchRadius; y <= searchRadius; ++y) {
		for(int x = -searchRadius; x <= searchRadius; ++x) {

			if(!notSelected) {

				if(isSelectedColor(texture2D(select, tex_coord+vec2(fragSize.x*x, fragSize.y*y)))) {
					col += highlightColor*mixFactor;
				}

				} else {
					if(!isSelectedColor(texture2D(select, tex_coord+vec2(fragSize.x*x, fragSize.y*y)))) {
						col += highlightColor*mixFactor;
					}
				}

			}
		}
		return col;

	}

	void main(){

		vec4 selectCol = texture2D(select, tex_coord);
		vec4 normalcol = texture2D(tex, tex_coord);



		gl_FragColor = normalcol + search(selectCol);


	}
