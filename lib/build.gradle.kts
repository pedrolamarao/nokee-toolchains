plugins {
    id("dev.nokee.cpp-library")
}

apply(plugin = "targets")

library {
    targetLinkages.addAll(linkages.static)
    targetMachines.addAll(
        machines.os("host").architecture("-x86_64-elf-multiboot2")
    )
}
