/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.10.2/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
    java
    war
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

group "majere.raistlin"

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is used by the application.
    //implementation(libs.guava)
    implementation("jakarta.platform:jakarta.jakartaee-web-api:9.1.0")
    implementation("jakarta.servlet:jakarta.servlet-api:6.1.0")
    implementation("jakarta.faces:jakarta.faces-api:4.1.1")
    implementation("com.oracle.database.jdbc:ojdbc11:23.6.0.24.10")
    implementation("net.bootsfaces:bootsfaces:2.0.1")
    implementation("ch.qos.logback:logback-classic:1.2.9")

    compileOnly("org.projectlombok:lombok:1.18.30")
    compileOnly("jakarta.enterprise:jakarta.enterprise.cdi-api:4.0.1")
    annotationProcessor("org.projectlombok:lombok:1.18.30")

}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(17)
    }
}


tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
