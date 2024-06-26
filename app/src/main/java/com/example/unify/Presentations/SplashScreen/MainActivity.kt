package com.example.unify.Presentations.SplashScreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.unify.Presentations.MainHomePage.MainHomeActivity
import com.example.unify.Presentations.SignUpScreen.SignUpScreen
import com.example.unify.R
import com.google.firebase.Firebase
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Handler(Looper.getMainLooper()).postDelayed({
            if(FirebaseAuth.getInstance().currentUser==null)
            startActivity(Intent(this, SignUpScreen::class.java))
            else
                startActivity(Intent(this,MainHomeActivity::class.java))
            finish()
        }, 2000)

    }
}