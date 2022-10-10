package com.pasandevin.android.mvvm_android.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import com.pasandevin.android.mvvm_android.R

class MainFragment : Fragment() {
    private var score = 0

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // TODO: Use the ViewModel

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val view = inflater.inflate(R.layout.fragment_main, container, false)


        val button = view.findViewById<Button>(R.id.countButton)
        val textView = view.findViewById<TextView>(R.id.message)

        button.setOnClickListener {
            score++
            textView.text = score.toString()
        }

        return view
    }

}