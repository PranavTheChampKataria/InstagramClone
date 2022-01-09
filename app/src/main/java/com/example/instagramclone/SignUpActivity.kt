package com.example.instagramclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
//        var signInBtn= this.findViewById(R.id.sign_in_link_btn)
        sign_in_link_btn.setOnClickListener (){
            startActivity(Intent(this,SignInActivity::class.java))
        }
    }
}


