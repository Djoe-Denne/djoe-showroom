plugins {
	java
	id("org.springframework.boot") version "3.0.4"
	id("io.spring.dependency-management") version "1.1.0"
	id("org.graalvm.buildtools.native") version "0.9.20"
	id("checkstyle")
}

group = "io.github.djoe-denne"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

configurations {
	compileOnly {
		extendsFrom(configurations.annotationProcessor.get())
	}
}

allprojects {
	repositories {
		mavenCentral()
	}
}

dependencies {
}

tasks.withType<Test> {
	useJUnitPlatform()
}
