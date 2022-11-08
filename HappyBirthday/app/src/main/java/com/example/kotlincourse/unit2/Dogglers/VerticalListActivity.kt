package com.example.kotlincourse.unit2.Dogglers

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlincourse.R
import com.example.kotlincourse.databinding.ActivityHorizontalMainBinding
import com.example.kotlincourse.databinding.ActivityVerticalMainBinding
import com.example.kotlincourse.unit2.Dogglers.adapterDogs.DogCardAdapter
import com.example.kotlincourse.unit2.Dogglers.layout.Layout

class VerticalListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityVerticalMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityVerticalMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerViewVertical.adapter = DogCardAdapter(
            applicationContext,
            Layout.HORIZONTAL
        )
        binding.recyclerViewVertical.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}