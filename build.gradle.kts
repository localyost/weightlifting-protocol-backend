plugins {
    java
    id("org.springframework.boot") version "3.4.2"
    id("io.spring.dependency-management") version "1.1.7"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(21)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

val lombokVersion = "1.18.36"
val openapiVersion = "2.8.3"
val springBootVersion="3.4.4"
val postgresVersion="42.7.4"

dependencies {

    //LOMBOK
    compileOnly("org.projectlombok:lombok:$lombokVersion")
    annotationProcessor("org.projectlombok:lombok:$lombokVersion")

    //SPRING
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-data-rest:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-web:$springBootVersion")
    implementation("org.springframework.boot:spring-boot-starter-websocket:$springBootVersion")
    testImplementation("org.springframework.boot:spring-boot-starter-test:$springBootVersion")

    //DATA Explorers
    implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:$openapiVersion")
//    implementation("org.springframework.data:spring-data-rest-hal-explorer")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    //SQLite
    runtimeOnly("org.xerial:sqlite-jdbc")
    runtimeOnly("org.hibernate.orm:hibernate-community-dialects")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
