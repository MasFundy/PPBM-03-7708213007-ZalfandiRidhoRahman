package com.example.assesment1

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class adapterpager(
    fragmentManager: FragmentManager,
    private val tabCount: Int
) : FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> Fragment1()
            1 -> Fragment2()
            2 -> Fragment3()
            else -> throw IllegalArgumentException("Invalid position: $position")
        }
    }

    override fun getCount(): Int {
        return tabCount
    }
    override fun getPageTitle(position: Int): CharSequence? {
        return when (position) {
            0 -> "3\uD83C\uDF1F"
            1 -> "2\uD83C\uDF1F"
            2 -> "1\uD83C\uDF1F"
            else -> null
        }
    }
}


