package com.example.kotlincourse.unit2.Dogglers

import android.os.Bundle
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlincourse.databinding.ActivityHorizontalMainBinding
import com.example.kotlincourse.unit2.Dogglers.adapterDogs.DogCardAdapter
import com.example.kotlincourse.unit2.Dogglers.layout.Layout

class HorizontalListActivity: AppCompatActivity() {

    private lateinit var binding: ActivityHorizontalMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityHorizontalMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.recyclerViewHorizontal.adapter = DogCardAdapter(
            applicationContext,
            Layout.HORIZONTAL
        )
        binding.recyclerViewHorizontal.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}