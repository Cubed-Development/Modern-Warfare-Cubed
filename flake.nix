{
  description = "Modern Warfare Cubed is a fork of the popular Vic's Modern Warfare Mod which is now discontinued aiming to improve and expand upon the experience.";

  inputs.nixpkgs.url = "github:NixOS/nixpkgs/nixpkgs-unstable";

  outputs = {
    self,
    nixpkgs,
  }: let
    system = "x86_64-linux";
    pkgs = nixpkgs.legacyPackages.${system};
  in {
    devShells.${system}.default = pkgs.mkShell {
      name = "mwc";

      packages = with pkgs; [temurin-bin-26 temurin-bin-8 xrandr];

      env = {
        JAVA_HOME = "${pkgs.temurin-bin-26}";

        GRADLE_OPTS = builtins.concatStringsSep " " [
          "-Dorg.gradle.java.installations.paths=${pkgs.temurin-bin-8},${pkgs.temurin-bin-26}"
          "-Dorg.gradle.java.installations.auto-detect=false"
          "-Dorg.gradle.java.installations.auto-download=false"
        ];

        LD_LIBRARY_PATH = pkgs.lib.makeLibraryPath (with pkgs; [
          libXcursor
          libXrandr
          libXxf86vm
          libGL
        ]);
      };
    };
  };
}
