package com.example.instagramclone

import android.os.Bundle
import android.widget.TextView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.instagramclone.Fragments.homeFragment
import com.example.instagramclone.Fragments.notificationsFragment
import com.example.instagramclone.Fragments.profileFragment
import com.example.instagramclone.Fragments.searchFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private fun moveToFragment(fragment:Fragment){
        val fragmentTrans=supportFragmentManager.beginTransaction()
        fragmentTrans.replace(R.id.fragment_container,fragment)
        fragmentTrans.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        moveToFragment(homeFragment())
        navView.setOnItemSelectedListener {
                item ->
            when (item.itemId) {
                R.id.nav_home -> {

                    moveToFragment(homeFragment())
                    true
                }
                R.id.nav_search -> {
                    moveToFragment(searchFragment())
                    true
                }
                R.id.nav_add_post -> {

                    true
                }
                R.id.nav_notifications -> {
                    moveToFragment(notificationsFragment())
                    true
                }
                R.id.nav_profile -> {
                    moveToFragment(profileFragment())
                    true
                }
            }

            false
        }



    }
}