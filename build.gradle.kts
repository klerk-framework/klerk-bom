plugins {
    `java-platform`
    `maven-publish`
}

javaPlatform {
    allowDependencies()
}

dependencies {
    constraints {
        api("com.github.klerk-framework:klerk:1.0.0-beta.6")
        api("com.github.klerk-framework:klerk-web:1.0.0-alpha.2")
        api("com.github.klerk-framework:klerk-graphql:1.0.0-alpha.2")
    }
    api(platform("io.ktor:ktor-bom:3.4.0"))
}

group = "dev.klerkframework"
version = "1.0.0-beta.6"

publishing {
    publications {
        create<MavenPublication>("Maven") {
            artifactId = "klerk-bom"
            from(components["javaPlatform"])
        }
    }
}
