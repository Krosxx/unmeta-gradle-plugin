
plugins {
    alias(libs.plugins.kotlin) apply false
    alias(libs.plugins.pluginPublish) apply false
}

allprojects {
}


tasks.register("clean", Delete::class.java) {
    delete(rootProject.buildDir)
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}
