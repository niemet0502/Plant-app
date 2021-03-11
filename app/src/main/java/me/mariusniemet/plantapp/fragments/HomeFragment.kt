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
<<<<<<< HEAD
        val view =  inflater?.inflate(R.layout.fragment_home, container, false)

        // recuperer le recycler view
        val horizontalRecyclerView = view.findViewById<RecyclerView>(R.id.horizontal_recycler_view)
        horizontalRecyclerView.adapter = PlantAdapter()
=======
       val view = inflater?.inflate(R.layout.fragment_home, container, false)

        //recuperer le recycler
        val HorizontalRecyclerView = view.findViewById<RecyclerView>(R.id.horizontal_recycler_view)
        HorizontalRecyclerView.adapter = PlantAdapter()
>>>>>>> cae50840acd24d996611e3d2ffe5521a8126363e
        return  view
    }
}