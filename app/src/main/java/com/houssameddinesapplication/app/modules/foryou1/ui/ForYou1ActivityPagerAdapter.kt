package com.houssameddinesapplication.app.modules.foryou1.ui

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.di.MyApp
import com.houssameddinesapplication.app.modules.foryou.ui.ForYouFragment
import kotlin.Int
import kotlin.String
import kotlin.collections.List

class ForYou1ActivityPagerAdapter(
    val fragmentManager: FragmentManager,
    val lifecycle: Lifecycle
) : FragmentStateAdapter(fragmentManager, lifecycle) {
    override fun getItemCount(): Int = viewPages.size

    override fun createFragment(position: Int): Fragment = viewPages[position]

    companion object AdapterConstant {
        val title: List<String> =
                listOf(MyApp.getInstance().resources.getString(R.string.lbl_for_you),MyApp.getInstance().resources.getString(R.string.lbl_following),MyApp.getInstance().resources.getString(R.string.lbl_trending))

        val viewPages: List<Fragment> = listOf(ForYouFragment(),ForYouFragment(),ForYouFragment())

    }
}
