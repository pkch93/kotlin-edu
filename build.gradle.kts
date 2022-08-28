plugins {
    kotlin("jvm") version "1.7.10"
}

group = "edu.pkch.kotlin"
version = "1.0.0"

repositories {
    mavenCentral()
}

tasks {
    java {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    compileKotlin {
        kotlinOptions.jvmTarget = JavaVersion.VERSION_17.toString()
    }

    test {
        useJUnitPlatform()
    }
}

dependencies {
    implementation(kotlin("stdlib"))
    implementation("org.jetbrains.kotlin:kotlin-reflect:1.4.21")
    testImplementation("org.junit.platform:junit-platform-launcher:1.9.0")
    testImplementation("org.junit.jupiter:junit-jupiter-engine:5.9.0")
    testImplementation("org.junit.jupiter:junit-jupiter-params:5.9.0")
    testImplementation("org.assertj:assertj-core:3.23.1")
}
