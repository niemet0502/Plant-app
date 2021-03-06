package me.mariusniemet.plantapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import me.mariusniemet.plantapp.R

class PlantAdapter(private val layoutId: Int) :RecyclerView.Adapter<PlantAdapter.ViewHolder>() {
    // boite pour ranger tous les composants a controler
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        // image
        val plantImage = view.findViewById<ImageView>(R.id.image_item)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(layoutId, parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int){}
    override fun getItemCount(): Int = 5


}