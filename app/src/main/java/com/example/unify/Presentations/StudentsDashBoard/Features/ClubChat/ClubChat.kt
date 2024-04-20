package com.example.unify.Presentations.StudentsDashBoard.Features.ClubChat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.unify.Presentations.ChattingSystem.ChatScreen.PersonalChatScreen
import com.example.unify.R
import com.example.unify.databinding.ActivityClubChatBinding

class ClubChat : AppCompatActivity() {
    val binding by lazy{
        ActivityClubChatBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val intent = Intent(applicationContext, PersonalClubChat::class.java)

        binding.cpwing.setOnClickListener {
            intent.putExtra("name","cpwing")
            applicationContext.startActivity(intent)
        }




        setContentView(binding.root)


    }
}
