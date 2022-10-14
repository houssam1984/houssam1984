package com.houssameddinesapplication.app.modules.trending1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.google.android.material.tabs.TabLayoutMediator
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.base.BaseActivity
import com.houssameddinesapplication.app.databinding.ActivityTrending1Binding
import com.houssameddinesapplication.app.modules.trending1.`data`.model.Trending1RowModel
import com.houssameddinesapplication.app.modules.trending1.`data`.viewmodel.Trending1VM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class Trending1Activity : BaseActivity<ActivityTrending1Binding>(R.layout.activity_trending1) {
  private val viewModel: Trending1VM by viewModels<Trending1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val trendingAdapter = TrendingAdapter(viewModel.trendingList.value?:mutableListOf())
    binding.recyclerTrending.adapter = trendingAdapter
    trendingAdapter.setOnItemClickListener(
    object : TrendingAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Trending1RowModel) {
        onClickRecyclerTrending(view, position, item)
      }
    }
    )
    viewModel.trendingList.observe(this) {
      trendingAdapter.updateData(it)
    }
    binding.trending1VM = viewModel
    val adapter = Trending1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutFrame9031,binding.viewPagerTabbarview) { tab, position ->
      tab.text = Trending1ActivityPagerAdapter.title[position]
      }.attach()
      setUpSearchViewGroup9020Listener()
    }

    override fun setUpClicks(): Unit {
    }

    fun onClickRecyclerTrending(
      view: View,
      position: Int,
      item: Trending1RowModel
    ): Unit {
      when(view.id) {
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
        const val TAG: String = "TRENDING1ACTIVITY"


        fun getIntent(context: Context, bundle: Bundle?): Intent {
          val destIntent = Intent(context, Trending1Activity::class.java)
          destIntent.putExtra("bundle", bundle)
          return destIntent
        }
      }
    }
