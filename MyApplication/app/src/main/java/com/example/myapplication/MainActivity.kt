package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var usernameInput:EditText
    lateinit var passwordInput:EditText
    lateinit var loginbtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        usernameInput=findViewById(R.id.username_input)
        passwordInput=findViewById(R.id.password)

        loginbtn=findViewById(R.id.loginbtn)








    }

    fun gotohome(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

    fun gosignup(view: View) {
        val intent = Intent(this, MainActivity4::class.java)
        startActivity(intent)

    }



}