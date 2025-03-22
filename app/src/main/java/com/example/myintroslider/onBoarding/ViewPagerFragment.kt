package com.example.myintroslider.onBoarding

import android.content.Context
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myintroslider.R
import com.example.myintroslider.sliderScreens.FirstScreen
import com.example.myintroslider.sliderScreens.SecondScreen
import com.example.myintroslider.sliderScreens.ThirdScreen

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

        val fragmentList = arrayListOf(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,requireActivity().supportFragmentManager,
            lifecycle
        )

        val viewPgr = view.findViewById<androidx.viewpager2.widget.ViewPager2>(R.id.viewPager2)

        viewPgr.adapter = adapter


        return view
    }

}