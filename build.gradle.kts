plugins {
    kotlin("jvm") version "1.7.10"
}

group = "edu.pkch"
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
    testImplementation("io.kotest:kotest-runner-junit5:5.4.2")
    testImplementation("io.kotest:kotest-assertions-core:5.4.2")
}
