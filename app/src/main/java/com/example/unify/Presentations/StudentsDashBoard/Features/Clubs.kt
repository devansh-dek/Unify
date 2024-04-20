package com.example.unify.Presentations.StudentsDashBoard.Features

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.unify.R
import com.example.unify.databinding.ActivityClubChatBinding

class Clubs : AppCompatActivity() {
    val binding by lazy {
        ActivityClubChatBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.cpwing.setOnClickListener {

        }



        setContentView(binding.root)
    }
}