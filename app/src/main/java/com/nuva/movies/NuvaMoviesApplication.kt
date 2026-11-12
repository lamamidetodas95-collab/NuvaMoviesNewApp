package com.nuva.movies

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.multidex.MultiDex
// import com.google.firebase.FirebaseApp

/**
 * Nuva Movies Application Class
 * Initializes app-wide components
 */
class NuvaMoviesApplication : Application() {

    companion object {
        lateinit var instance: NuvaMoviesApplication
            private set
        
        const val NOTIFICATION_CHANNEL_ID = "nuva_movies_channel"
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
        
        // Initialize MultiDex
        MultiDex.install(this)
        
        // Initialize Firebase (Descomentar cuando agregues google-services.json)
        // FirebaseApp.initializeApp(this)
        
        // Create notification channel
        createNotificationChannel()
    }

    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = getString(R.string.app_name)
            val descriptionText = "Nuva Movies Notifications"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(NOTIFICATION_CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }
            
            val notificationManager = getSystemService(NotificationManager::class.java)
            notificationManager.createNotificationChannel(channel)
        }
    }
}
