{ pkgs }: {
    deps = [
      pkgs.twelf
      pkgs.nettools
      pkgs.openssh
        pkgs.graalvm17-ce
        pkgs.maven
        pkgs.replitPackages.jdt-language-server
        pkgs.replitPackages.java-debug
    ];
}