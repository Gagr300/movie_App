package com.example.movie_app

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class FilmAdapter (fragment: FragmentActivity) :
    FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 20
    override fun createFragment(position: Int): Fragment {

        val fragment = FlimFragment()
        fragment.arguments = Bundle().apply{
            putInt(ARG_OBJECT, position + 1)
        }
        return fragment
    }

}