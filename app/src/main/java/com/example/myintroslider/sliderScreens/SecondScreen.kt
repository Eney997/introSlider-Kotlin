package com.example.myintroslider.sliderScreens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.example.myintroslider.R

class SecondScreen : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_second_screen, container, false)

        val btnNExtTwo = view.findViewById<Button>(R.id.btnNext2)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager2)

        btnNExtTwo.setOnClickListener{
            viewPager?.currentItem = 2
        }

        return view
    }


}