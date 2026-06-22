pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "my-first-app"

// Говорим Gradle, что весь код лежит прямо тут, в корне, а не в папке app
include(":app")
project(":app").projectDir = file(".")
