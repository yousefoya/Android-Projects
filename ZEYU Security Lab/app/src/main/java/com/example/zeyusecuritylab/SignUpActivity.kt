package com.example.zeyusecuritylab

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        // Ensure spinner dropdown styling matches dark monospace cyber theme
        val spinner: Spinner = findViewById(R.id.spinnerDepartment)
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.department_list,
            R.layout.spinner_item
        ).also { itemAdapter ->
            itemAdapter.setDropDownViewResource(R.layout.spinner_dropdown_item)
        }
        spinner.adapter = adapter

        val btnSignUp: Button = findViewById(R.id.btnSignUp)
        val tvLoginLink: TextView = findViewById(R.id.tvLoginLink)

        // Navigation to Profile screen for easy evaluation
        val openProfile = {
            val intent = Intent(this, ProfileActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
        }

        btnSignUp.setOnClickListener { openProfile() }
        tvLoginLink.setOnClickListener { openProfile() }
    }
}
