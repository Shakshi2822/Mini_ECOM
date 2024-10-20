plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.kotlin.compose)


}

android {
    namespace = "com.example.myapplication"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.myapplication"
        minSdk = 21
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {



            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {

        dataBinding=true
        compose = true
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.lifecycle.runtime.ktx)
    implementation(libs.androidx.activity.compose)
    implementation(platform(libs.androidx.compose.bom))
    implementation(libs.androidx.ui)
    implementation(libs.androidx.ui.graphics)
    implementation(libs.androidx.ui.tooling.preview)
    implementation(libs.androidx.material3)
    implementation(libs.androidx.activity)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    androidTestImplementation(platform(libs.androidx.compose.bom))
    androidTestImplementation(libs.androidx.ui.test.junit4)
    debugImplementation(libs.androidx.ui.tooling)
    debugImplementation(libs.androidx.ui.test.manifest)

    implementation ("org.jetbrains.kotlin:kotlin-stdlib:1.8.0")

    implementation ("com.android.support:appcompat-v7:28.0.0")// Example
    implementation ("com.google.android.material:material:1.2.1") // Example

        implementation ("androidx.appcompat:appcompat:1.4.2")
        implementation ("androidx.recyclerview:recyclerview:1.2.1")
        implementation ("androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.1")
        implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.5.1")
        implementation ("androidx.constraintlayout:constraintlayout:2.1.4")

        // Retrofit for networking
        implementation ("com.squareup.retrofit2:retrofit:2.9.0")
        implementation ("com.squareup.retrofit2:converter-gson:2.9.0")

        // Room Database
        implementation ("androidx.room:room-runtime:2.4.2")
         // Use kapt for Room annotation processing

        // Glide for image loading
        implementation ("com.github.bumptech.glide:glide:4.13.0")


        // Material Design
        implementation ("com.google.android.material:material:1.7.0")

        // Navigation Components
        implementation ("androidx.navigation:navigation-fragment-ktx:2.5.1")
        implementation ("androidx.navigation:navigation-ui-ktx:2.5.1")

        // Testing
        testImplementation ("junit:junit:4.13.2")
        androidTestImplementation ("androidx.test.ext:junit:1.1.3")
        androidTestImplementation ("androidx.test.espresso:espresso-core:3.4.0")
    }

