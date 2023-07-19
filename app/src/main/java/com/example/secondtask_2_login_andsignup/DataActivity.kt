package com.example.secondtask_2_login_andsignup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView

class DataActivity : AppCompatActivity() {
    lateinit var dataTextView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)
        dataTextView =findViewById(R.id.date_textview)
        dataTextView.text="yourname is ${intent.getStringExtra(SignUPActivity.firstNameKey) }  ${intent.getStringExtra(SignUPActivity.lastNameKey) }\n your username is${intent.getStringExtra(SignUPActivity.userNameKey)} \n yor password is ${intent.getStringExtra(SignUPActivity.passwordNameKey) } }"
    }
}