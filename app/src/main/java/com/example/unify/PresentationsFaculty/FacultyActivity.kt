package com.example.unify.PresentationsFaculty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import com.example.unify.R
import com.example.unify.Utils.POST_FOLDER
import com.example.unify.databinding.ActivityFacultyBinding
import com.example.unify.databinding.ActivityPostsBinding
import uploadImage

class FacultyActivity : AppCompatActivity() {

    val binding by lazy {
        ActivityFacultyBinding.inflate(layoutInflater)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding.attendance.setOnClickListener {
            startActivity(Intent(this,AttendanceActivity::class.java))
        }
        setContentView(binding.root)



    }
}