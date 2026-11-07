package com.example.zeyusecuritylab

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val btnEditProfile: Button = findViewById(R.id.btnEditProfile)
        val tvGoToSignUp: TextView = findViewById(R.id.tvGoToSignUp)

        // Navigation to Sign-Up screen for easy evaluation
        val openSignUp = {
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        btnEditProfile.setOnClickListener { openSignUp() }
        tvGoToSignUp.setOnClickListener { openSignUp() }
    }
}
