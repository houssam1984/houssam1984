package com.houssameddinesapplication.app.modules.trendingposts1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.google.android.material.tabs.TabLayoutMediator
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.base.BaseActivity
import com.houssameddinesapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.houssameddinesapplication.app.databinding.ActivityTrendingPosts1Binding
import com.houssameddinesapplication.app.modules.trendingposts1.`data`.viewmodel.TrendingPosts1VM
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

class TrendingPosts1Activity :
    BaseActivity<ActivityTrendingPosts1Binding>(R.layout.activity_trending_posts1) {
  private val viewModel: TrendingPosts1VM by viewModels<TrendingPosts1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.trendingPosts1VM = viewModel
    val adapter = TrendingPosts1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutFrame9031,binding.viewPagerTabbarview) { tab, position ->
      tab.text = TrendingPosts1ActivityPagerAdapter.title[position]
      }.attach()
      setUpSearchViewGroup9020Listener()
    }

    override fun setUpClicks(): Unit {


      binding.btnCamera.setOnClickListener {
        ImagePickerFragmentDialog().show(supportFragmentManager)
        { path ->//TODO HANDLE DATA
        }

      }
    }

    private fun setUpSearchViewGroup9020Listener(): Unit {
      binding.searchViewGroup9020.setOnQueryTextListener(object :
      SearchView.OnQueryTextListener {
        override fun onQueryTextSubmit(p0 : String) : Boolean {
          // Performs search when user hit
          // the search button on the keyboard
          return false
        }
        override fun onQueryTextChange(p0 : String) : Boolean {
          // Start filtering the list as user
          // start entering the characters
          return false
        }
        })
      }

      companion object {
        const val TAG: String = "TRENDING_POSTS1ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, TrendingPosts1Activity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
