project {
    name = "Polyglot :: Kotlin"
    groupId = "io.takari.polyglot"
    artifactId = "regular-project"
    version = "0.3.3-SNAPSHOT"
    packaging = jar

    val junitVersion = 4.12
    val kotlinVersion = "1.1.61"

    dependencies {
        compile("org.jetbrains.kotlin:kotlin-stdlib:$kotlinVersion")
        compile(it.groupId + ":polyglot-common:" + it.version)
                .exclusions("org.slf4j:jul-logger")

        test(
                "junit:junit:$junitVersion" exclusions "org.hamcrest:hamcrest-core",
                "org.jetbrains.kotlin:kotlin-test-junit:$kotlinVersion"
        )
        provided(
                "io.takari.polyglot:polyglot-kotlin:0.3.3-SNAPSHOT",
                "org.apache.maven.plugin-tools:maven-plugin-annotations:3.3"
        )
    }
}
