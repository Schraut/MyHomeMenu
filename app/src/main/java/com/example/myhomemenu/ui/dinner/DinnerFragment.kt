package com.example.myhomemenu.ui.dinner

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.myhomemenu.databinding.FragmentDinnerBinding

class DinnerFragment : Fragment() {

    private lateinit var dinnerViewModel: DinnerViewModel
    private var _binding: FragmentDinnerBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dinnerViewModel =
            ViewModelProvider(this).get(DinnerViewModel::class.java)

        _binding = FragmentDinnerBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textDinner
        dinnerViewModel.text.observe(
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
