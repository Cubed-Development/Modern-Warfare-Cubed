{
  description = "Modern Warfare Cubed is a fork of the popular Vic's Modern Warfare Mod which is now discontinued aiming to improve and expand upon the experience.";

  inputs.nixpkgs.url = "github:NixOS/nixpkgs/nixpkgs-unstable";

  outputs = {
    self,
    nixpkgs,
  }: let
    system = "x86_64-linux";
    pkgs = nixpkgs.legacyPackages.${system};
    inherit (pkgs) lib;

    gradleJdk = pkgs.temurin-bin-26;
    gameJdk = pkgs.temurin-bin-8;
  in {
    devShells.${system}.default = pkgs.mkShell {
      name = "mwc";

      packages = [gradleJdk gameJdk pkgs.xrandr];

      env = {
        GRADLE_OPTS = toString [
          "-Dorg.gradle.java.installations.paths=${gradleJdk},${gameJdk}"
          "-Dorg.gradle.java.installations.auto-detect=false"
          "-Dorg.gradle.java.installations.auto-download=false"
        ];

        LD_LIBRARY_PATH = lib.makeLibraryPath (with pkgs; [
          openal
          libXcursor
          libXrandr
          libXxf86vm
          libGL
        ]);
      };
    };
  };
}
