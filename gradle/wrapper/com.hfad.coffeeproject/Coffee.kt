package com.hfad.coffeeproject5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

class Coffee : Fragment() {
    override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_coffee, container, false)
        val startButton = view.findViewById<Button>(R.id.start_button)

        startButton.setOnClickListener {
            view.findNavController()
                .navigate(R.id.action_coffee_to_coffeeOptions)
        }
        return view
    }
}
