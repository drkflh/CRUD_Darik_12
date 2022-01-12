package com.crud_darik_12.room

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.crud_darik_12.R

class splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
        supportActionBar?.hide()
        Handler().postDelayed({
            val intent = Intent (this@splash, Home::class.java)
            startActivity(intent)
        }, 3000)
    }
}