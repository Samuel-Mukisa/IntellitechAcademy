package com.mukisasamuel.intellitechacademy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

import com.mukisasamuel.intellitechacademy.ui.home.HomeFragment

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
        val b = Intent(this@SplashActivity,MainActivity ::class.java)
            startActivity(b)
            finish()
        },2000)
    }
}