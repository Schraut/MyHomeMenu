package com.example.myhomemenu.ui.lunch

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myhomemenu.databinding.FragmentLunchBinding

class LunchFragment : Fragment() {

    private lateinit var lunchViewModel: LunchViewModel
    private var _binding: FragmentLunchBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        lunchViewModel =
            ViewModelProvider(this).get(LunchViewModel::class.java)

        _binding = FragmentLunchBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textLunch
        lunchViewModel.text.observe(
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
