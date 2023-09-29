package com.udemy.assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    val tabArray = arrayOf("Personal","Business","Merchant")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewPager2= findViewById<ViewPager2>(R.id.viewpager2)
        val tablay = findViewById<TabLayout>(R.id.tabMode)
        val viewAdapter = MyViewPagerAdapter(supportFragmentManager,lifecycle)
        viewPager2.adapter = viewAdapter
        // connecting viewpager with tablayout
        TabLayoutMediator(tablay,viewPager2){
                tab,position -> tab.text = tabArray[position]
        }.attach()
    }
    private class MyViewPagerAdapter(supportFragmentManager: FragmentManager,lifecycle: Lifecycle):FragmentStateAdapter(supportFragmentManager,lifecycle) {
        override fun getItemCount(): Int {
            return 3
        }
        override fun createFragment(position: Int): Fragment {
            when(position){
                0-> return PersonnalFragment()
                1-> return BusinessFragment()
            }
            return MerchantFragment()
        }
        }
    }
