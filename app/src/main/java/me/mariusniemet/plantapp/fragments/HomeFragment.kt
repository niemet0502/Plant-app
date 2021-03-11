package me.mariusniemet.plantapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import me.mariusniemet.plantapp.R
import me.mariusniemet.plantapp.adapter.PlantAdapter

class HomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view =  inflater?.inflate(R.layout.fragment_home, container, false)
        //recuperer le recycler
        val HorizontalRecyclerView = view.findViewById<RecyclerView>(R.id.horizontal_recycler_view)
        HorizontalRecyclerView.adapter = PlantAdapter(R.layout.item_horizontal_plant)

        // second recycler view

        val verticalRecyclerView = view.findViewById<RecyclerView>(R.id.vertical_recycler_view)
        verticalRecyclerView.adapter = PlantAdapter(R.layout.item_vertical_plant)
        return  view
    }
}