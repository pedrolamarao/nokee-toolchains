pluginManagement {
    val nokee = "0.4.0+"
    plugins {
        id("dev.nokee.cpp-application").version(nokee)
        id("dev.nokee.cpp-library").version(nokee)
        id("dev.nokee.native-unit-testing").version(nokee)
    }
    repositories {
        maven {
            name = "Nokee Release Repository"
            url = uri("https://repo.nokee.dev/release")
            mavenContent() {
                includeGroupByRegex("dev\\.nokee.*")
                includeGroupByRegex("dev\\.gradleplugins.*")
            }
        }
        maven {
            name = "Nokee Snapshot Repository"
            url = uri("https://repo.nokee.dev/snapshot")
            mavenContent() {
                includeGroupByRegex("dev\\.nokee.*")
                includeGroupByRegex("dev\\.gradleplugins.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}

rootProject.name = "nokee-toolchains"

include("app")
include("lib")
