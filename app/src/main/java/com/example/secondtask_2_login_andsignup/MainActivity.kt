package com.example.secondtask_2_login_andsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var singnUpTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        singnUpTextView =findViewById(R.id.signup_textview)
        singnUpTextView.setOnClickListener {
            startActivity(Intent(this,SignUPActivity::class.java))
        }
    }
}