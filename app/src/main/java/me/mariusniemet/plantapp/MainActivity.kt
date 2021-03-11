package me.mariusniemet.plantapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.mariusniemet.plantapp.fragments.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // integrer le fragment dans notre container

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, HomeFragment())
        transaction.addToBackStack(null)
        transaction.commit()
    }
}