plugins {
    `java-platform`
    `maven-publish`
}

javaPlatform {
    allowDependencies()
}

dependencies {
    constraints {
        api("dev.klerkframework:klerk:1.0.0-beta.7-SNAPSHOT")
        api("dev.klerkframework:klerk-web:1.0.0-alpha.2-SNAPSHOT")
        api("dev.klerkframework:klerk-graphql:1.0.0-alpha.2-SNAPSHOT")
    }
    api(platform("io.ktor:ktor-bom:3.4.2"))
}

group = "dev.klerkframework"
version = "1.0.0-beta.7-SNAPSHOT"

publishing {
    publications {
        create<MavenPublication>("Maven") {
            artifactId = "klerk-bom"
            from(components["javaPlatform"])
        }
    }
}
