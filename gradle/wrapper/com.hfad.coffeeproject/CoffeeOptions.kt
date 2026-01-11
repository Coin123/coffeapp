package com.hfad.coffeeproject5

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class CoffeeOptions : Fragment() {

    // Reference to the buttons in the fragment
    private lateinit var cappuccinoButton: Button
    private lateinit var espressoButton: Button
    private lateinit var americanoButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_coffee_options, container, false)

        // Initialize buttons
        cappuccinoButton = view.findViewById(R.id.cappuccino_button)
        espressoButton = view.findViewById(R.id.espresso_button)
        americanoButton = view.findViewById(R.id.americano_button)

        // Set click listeners for each button
        cappuccinoButton.setOnClickListener {
            showToast("Cappuccino selected")
            // Add logic for handling cappuccino selection
        }

        espressoButton.setOnClickListener {
            showToast("Espresso selected")
            // Add logic for handling espresso selection
        }

        americanoButton.setOnClickListener {
            showToast("Americano selected")
            // Add logic for handling americano selection
        }

        return view
    }

    // Function to show a toast message
    private fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    } }
