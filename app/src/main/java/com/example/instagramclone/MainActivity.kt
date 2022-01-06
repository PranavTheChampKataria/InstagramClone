package com.example.instagramclone

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)
            textView=findViewById(R.id.message)
        navView.setOnItemSelectedListener {
                item ->
            when (item.itemId) {
                R.id.nav_home -> {
                    textView.setText("Home")
                    true
                }
                R.id.nav_search -> {
                    textView.setText("Dashboard")
                     true
                }
                R.id.nav_add_post -> {
                    textView.setText("Add Post")
                     true
                }
                R.id.nav_notifications -> {
                    textView.setText("Notifications")
                    true
                }
                R.id.nav_profile -> {
                    textView.setText("Profile")
                     true
                }
            }
            false
        }


    }
}