package com.houssameddinesapplication.app.modules.discover.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.base.BaseActivity
import com.houssameddinesapplication.app.databinding.ActivityDiscoverBinding
import com.houssameddinesapplication.app.modules.discover.`data`.model.DiscoverRowModel
import com.houssameddinesapplication.app.modules.discover.`data`.viewmodel.DiscoverVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DiscoverActivity : BaseActivity<ActivityDiscoverBinding>(R.layout.activity_discover) {
  private val viewModel: DiscoverVM by viewModels<DiscoverVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val discoverAdapter = DiscoverAdapter(viewModel.discoverList.value?:mutableListOf())
    binding.recyclerDiscover.adapter = discoverAdapter
    discoverAdapter.setOnItemClickListener(
    object : DiscoverAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : DiscoverRowModel) {
        onClickRecyclerDiscover(view, position, item)
      }
    }
    )
    viewModel.discoverList.observe(this) {
      discoverAdapter.updateData(it)
    }
    binding.discoverVM = viewModel
    setUpSearchViewGroup9020Listener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerDiscover(
    view: View,
    position: Int,
    item: DiscoverRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewGroup9020Listener(): Unit {
    binding.searchViewGroup9020.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
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
      const val TAG: String = "DISCOVER_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, DiscoverActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
