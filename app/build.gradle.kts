plugins {
    id("dev.nokee.cpp-application")
}

apply(plugin = "targets")

application {
    targetMachines.addAll(
        machines.os("host").architecture("-x86_64-elf-multiboot2")
    )
    dependencies {
        implementation(project(":lib"))
    }
}