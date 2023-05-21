package com.example.datatransferactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.datatransferactivity.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()

        binding.textDetails.text = intent.getStringExtra("TEXT_VALUE")
    }

    override fun onResume() {
        super.onResume()

        binding.detailsButton.setOnClickListener {
            finish()
        }
    }
}