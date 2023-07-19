package com.example.secondtask_2_login_andsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class SignUPActivity : AppCompatActivity() {
    lateinit var firstNameEditText: EditText
    lateinit var lastNameEditText: EditText
    lateinit var userNameEditText: EditText
    lateinit var passwodEditText: EditText
    lateinit var passwordConfirmEditText: EditText
    lateinit var signUpButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_upactivity)
        daclareViews()
        signUpButton.setOnClickListener {
            var intent = Intent(this, DataActivity::class.java)
            intent.putExtra(firstNameKey, firstNameEditText.text.toString())
            intent.putExtra(lastNameKey, lastNameEditText.text.toString())
            intent.putExtra(userNameKey, userNameEditText.text.toString())
            intent.putExtra(passwordNameKey, passwodEditText.text.toString())
            intent.putExtra(passwordConfirmNameKey, passwordConfirmEditText.text.toString())
            startActivity(intent)

        }

    }

    private fun daclareViews() {
        firstNameEditText = findViewById(R.id.firstname_edittext)
        lastNameEditText = findViewById(R.id.lastname_edittext)
        userNameEditText = findViewById(R.id.username_edittext)
        passwodEditText = findViewById(R.id.password_edittext)
        passwordConfirmEditText = findViewById(R.id.passwordconfirm_edittext)
        signUpButton = findViewById(R.id.signup_button)
    }
    companion object{
        val firstNameKey="firstNameKey"
        val lastNameKey="lastNameKey"
        val userNameKey="userNameKey"
        val passwordNameKey="passwordNameKey"
        val passwordConfirmNameKey="passwordConfirmNameKey"

    }
}