import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.7.10"
    kotlin("kapt") version "1.7.10"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    implementation("io.vertx:vertx-core:4.3.3")
    implementation("io.vertx:vertx-service-proxy:4.3.3")

    kapt("io.vertx:vertx-codegen:4.3.3:processor")
    compileOnly("io.vertx:vertx-codegen:4.3.3")
}

tasks.test {
    useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
    kotlinOptions.jvmTarget = "1.8"
}
