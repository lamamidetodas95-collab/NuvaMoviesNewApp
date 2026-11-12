package com.nuva.movies.ui.activity

import android.os.Bundle
import android.view.KeyEvent
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.nuva.movies.R
import com.nuva.movies.ui.fragment.HomeFragment
import com.nuva.movies.ui.fragment.LiveTVFragment
import com.nuva.movies.ui.fragment.MoviesFragment
import com.nuva.movies.ui.fragment.ProfileFragment
import com.nuva.movies.ui.fragment.SeriesFragment

/**
 * Main Home Activity
 * Contains bottom navigation and fragments
 */
class HomeActivity : AppCompatActivity() {

    private lateinit var bottomNav: BottomNavigationView
    private var currentFragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        
        supportActionBar?.hide()
        
        setupBottomNavigation()
        
        // Load home fragment by default
        if (savedInstanceState == null) {
            loadFragment(HomeFragment())
        }
    }

    private fun setupBottomNavigation() {
        bottomNav = findViewById(R.id.bottom_navigation)
        
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    loadFragment(HomeFragment())
                    true
                }
                R.id.nav_movies -> {
                    loadFragment(MoviesFragment())
                    true
                }
                R.id.nav_series -> {
                    loadFragment(SeriesFragment())
                    true
                }
                R.id.nav_live -> {
                    loadFragment(LiveTVFragment())
                    true
                }
                R.id.nav_profile -> {
                    loadFragment(ProfileFragment())
                    true
                }
                else -> false
            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        currentFragment = fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        // Handle remote control keys for Android TV
        return when (keyCode) {
            KeyEvent.KEYCODE_BACK -> {
                if (currentFragment !is HomeFragment) {
                    bottomNav.selectedItemId = R.id.nav_home
                    true
                } else {
                    super.onKeyDown(keyCode, event)
                }
            }
            else -> super.onKeyDown(keyCode, event)
        }
    }
}
