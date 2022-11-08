package com.example.kotlincourse.unit2.Dogglers.adapterDogs

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Layout
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlincourse.R
import com.example.kotlincourse.unit2.Dogglers.DataSource.DataSource
import com.example.kotlincourse.unit2.Dogglers.layout.Layout.GRID
import com.example.kotlincourse.unit2.Dogglers.model.Dog

class DogCardAdapter(
    private val context: Context?, private val layout: Int
) : RecyclerView.Adapter<DogCardAdapter.DogCardViewHolder>() {

    private val dog = DataSource.dogs

    class DogCardViewHolder (view: View?): RecyclerView.ViewHolder(view!!) {
        val dogImageView: ImageView? = view!!.findViewById(R.id.dog_image)
        val dogNameTextView: TextView? = view!!.findViewById(R.id.dog_name)
        val dogAgeTextView: TextView? = view!!.findViewById(R.id.dog_age)
        val dogHobbyTextView: TextView? = view!!.findViewById(R.id.dog_hobby)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DogCardViewHolder {
        val adapterLayout = when (layout) {
            GRID -> LayoutInflater.from(parent.context).inflate(R.layout.grid_item_list_dog, parent, false)
            else -> LayoutInflater.from(parent.context).inflate(R.layout.vertical_horizontal_item_list, parent, false)
        }

        return DogCardViewHolder(adapterLayout)    }

    override fun onBindViewHolder(holder: DogCardViewHolder, position: Int) {
        val dataSet = dog[position]
        holder.dogImageView?.setImageResource(dataSet.imageResourceId)
        holder.dogNameTextView?.text = dataSet.name
        holder.dogAgeTextView?.text=dataSet.age
        holder.dogHobbyTextView?.text=dataSet.hobbies
    }

    override fun getItemCount(): Int {
        return dog.size
    }


}