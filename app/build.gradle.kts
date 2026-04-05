plugins {
    id("com.android.application")
}

android {
    namespace = "com.stephansdigitalerassistent.wearosmaxcomplications"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.stephansdigitalerassistent.wearosmaxcomplications"
        minSdk = 33
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
}

dependencies {
    // WFF is declarative XML, no code dependencies needed for bundling.
}
