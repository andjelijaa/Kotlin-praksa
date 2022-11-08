package com.example.kotlincourse.unit2.Dogglers

import android.os.Bundle
import androidx.activity.OnBackPressedCallback

import androidx.appcompat.app.AppCompatActivity
import com.example.kotlincourse.databinding.ActivityGridMainBinding
import com.example.kotlincourse.unit2.Dogglers.adapterDogs.DogCardAdapter
import com.example.kotlincourse.unit2.Dogglers.layout.Layout
import com.example.kotlincourse.unit2.Dogglers.layout.Layout.GRID


class GridListActivity: AppCompatActivity() {

    private lateinit var binding: ActivityGridMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGridMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerViewGrid.adapter = DogCardAdapter(
            applicationContext,
            Layout.GRID
        )
        binding.recyclerViewGrid.setHasFixedSize(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
  }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}