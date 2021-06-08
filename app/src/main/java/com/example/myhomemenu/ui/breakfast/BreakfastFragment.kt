package com.example.myhomemenu.ui.breakfast

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myhomemenu.databinding.FragmentBreakfastBinding

class BreakfastFragment : Fragment() {

    private lateinit var breakfastViewModel: BreakfastViewModel
    private var _binding: FragmentBreakfastBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        breakfastViewModel =
            ViewModelProvider(this).get(BreakfastViewModel::class.java)

        _binding = FragmentBreakfastBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textBreakfast
        breakfastViewModel.text.observe(
            viewLifecycleOwner,
            Observer {
                textView.text = it
            }
        )
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
