package com.nuva.movies.ui.activity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.nuva.movies.R

/**
 * Welcome/Splash Screen Activity
 * Shows branding and initializes app
 */
class WelcomeActivity : AppCompatActivity() {

    private val splashDelay = 2000L // 2 seconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        
        // Hide action bar
        supportActionBar?.hide()
        
        // Delay and navigate to Home
        Handler(Looper.getMainLooper()).postDelayed({
            navigateToHome()
        }, splashDelay)
    }

    private fun navigateToHome() {
        val intent = Intent(this, HomeActivity::class.java)
        startActivity(intent)
        finish()
        
        // Add transition animation
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
    }

    override fun onBackPressed() {
        // Disable back button on splash
    }
}
