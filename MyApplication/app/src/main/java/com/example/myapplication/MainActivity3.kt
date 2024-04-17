package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    fun gotopizza(view: View) {
        val intent = Intent(this, MainActivity5::class.java)
        startActivity(intent)
    }

    fun gotoprofile(view: View) {
        val intent = Intent(this, MainActivity6::class.java)
        startActivity(intent)
    }

    fun goprof(view: View) {
        val intent = Intent(this, MainActivity6::class.java)
        startActivity(intent)
    }

    fun gotoprofilepage(view: View) { val intent = Intent(this, MainActivity6::class.java)
        startActivity(intent)
    }
}