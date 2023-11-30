import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.21"
    application
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))

    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.6.4")

    implementation(project(":gradle_model"))

    implementation(project(":gradle_util"))
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}

tasks.register("author") {
    val author: String by project
    val email: String by project

    doLast {
        println("Author $author + $email")
    }
}

tasks.register("helloworld") {
    doFirst {
        println("Hello")
    }
    doLast {
        println("World")
    }
}