plugins {
    `java-platform`
    `maven-publish`
}

javaPlatform {
    allowDependencies()
}

dependencies {
    constraints {
        api("dev.klerkframework:klerk:1.0.0-beta.5")
        api("dev.klerkframework:klerk-web:1.0.0-alpha.3")
        api("dev.klerkframework:klerk-graphql:1.0.0-alpha.2")
    }
    api(platform("io.ktor:ktor-bom:3.4.0"))
}

group = "dev.klerkframework"
version = "1.0.0-beta.5"

publishing {
    publications {
        create<MavenPublication>("Maven") {
            artifactId = "klerk-bom"
            from(components["javaPlatform"])
        }
    }
}
