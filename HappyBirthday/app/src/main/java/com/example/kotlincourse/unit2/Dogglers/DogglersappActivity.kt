package com.example.kotlincourse.unit2.Dogglers

import android.content.Intent
import android.os.Binder
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlincourse.R
import com.example.kotlincourse.databinding.ActivityDogglersMainBinding


class DogglersappActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDogglersMainBinding
    private lateinit var listIntent: Intent

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDogglersMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.horizontalBtn.setOnClickListener { onHorizontal() }
        binding.verticalBtn.setOnClickListener { onVertical() }
        binding.gridBtn.setOnClickListener { onGrid() }
    }

    private fun onGrid() {
        listIntent = Intent(this, GridListActivity::class.java)
        startActivity(listIntent)    }

    private fun onHorizontal() {
        listIntent = Intent(this, HorizontalListActivity::class.java)
        startActivity(listIntent)    }

    private fun onVertical() {
        listIntent = Intent(this, VerticalListActivity::class.java)
        startActivity(listIntent)    }
}