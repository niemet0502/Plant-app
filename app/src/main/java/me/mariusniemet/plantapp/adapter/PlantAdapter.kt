package me.mariusniemet.plantapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import me.mariusniemet.plantapp.R

class PlantAdapter :RecyclerView.Adapter<PlantAdapter.ViewHolder>() {
    // boite pour ranger tous les composants a controler
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        // image
        val plantImage = view.findViewById<ImageView>(R.id.image_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_horizontal_plant, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = 5

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}