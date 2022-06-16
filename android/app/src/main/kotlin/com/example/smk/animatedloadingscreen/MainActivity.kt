package com.example.smk.animatedloadingscreen
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import io.flutter.embedding.android.FlutterActivity
class MainActivity: FlutterActivity() {
    private var keepSplashOnScreen = true
    private val delay by lazy { 10000L }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Handle the splash screen transition.
        val splashScreen = installSplashScreen()
        splashScreen.setKeepOnScreenCondition   { keepSplashOnScreen }
        Handler(Looper.getMainLooper()).postDelayed({keepSplashOnScreen=false},delay)

    }
}
