plugins {
    alias(libs.plugins.android.library)
    alias(libs.plugins.jetbrains.kotlin.android)
    id("kotlin-kapt")
}

android {
    namespace = "com.example.feature_home"
    compileSdk = 34
    buildFeatures.viewBinding = true

    defaultConfig {
        minSdk = 29
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }
    kotlinOptions {
        jvmTarget = "17"
    }
}

kapt {
    correctErrorTypes = true
}

dependencies {

    implementation(project(":core"))

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)

    implementation(libs.dagger)
    kapt(libs.dagger.compiler)

    implementation(libs.gson)
    implementation(libs.retrofit)
    implementation (libs.logging.interceptor)
    implementation(libs.converter.gson)

    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation("androidx.fragment:fragment-ktx:1.8.5")
    implementation ("com.github.bumptech.glide:glide:4.16.0")
}