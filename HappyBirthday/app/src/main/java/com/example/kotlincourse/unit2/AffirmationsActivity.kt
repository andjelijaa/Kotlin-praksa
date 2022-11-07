package com.example.kotlincourse.unit2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlincourse.R
import com.example.kotlincourse.unit2.adapter.ItemAdapter
import com.example.kotlincourse.unit2.data.Datasource

class AffirmationsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_affirmations_main)
        val myDataset=Datasource().loadAffirmations()
        val recycleView=findViewById<RecyclerView>(R.id.recycler_view)
        recycleView.adapter=ItemAdapter(this,myDataset)
        recycleView.setHasFixedSize(true)
    }
}