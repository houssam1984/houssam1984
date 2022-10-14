package com.houssameddinesapplication.app.modules.storiesandtweets.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.base.BaseActivity
import com.houssameddinesapplication.app.appcomponents.views.ImagePickerFragmentDialog
import com.houssameddinesapplication.app.databinding.ActivityStoriesAndTweetsBinding
import com.houssameddinesapplication.app.modules.storiesandtweets.`data`.model.ListellipsetwelveRowModel
import com.houssameddinesapplication.app.modules.storiesandtweets.`data`.model.ListellipsetwentytwoRowModel
import com.houssameddinesapplication.app.modules.storiesandtweets.`data`.viewmodel.StoriesAndTweetsVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class StoriesAndTweetsActivity :
    BaseActivity<ActivityStoriesAndTweetsBinding>(R.layout.activity_stories_and_tweets) {
  private val viewModel: StoriesAndTweetsVM by viewModels<StoriesAndTweetsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipsetwentytwoAdapter =
    ListellipsetwentytwoAdapter(viewModel.listellipsetwentytwoList.value?:mutableListOf())
    binding.recyclerListellipsetwentytwo.adapter = listellipsetwentytwoAdapter
    listellipsetwentytwoAdapter.setOnItemClickListener(
    object : ListellipsetwentytwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipsetwentytwoRowModel) {
        onClickRecyclerListellipsetwentytwo(view, position, item)
      }
    }
    )
    viewModel.listellipsetwentytwoList.observe(this) {
      listellipsetwentytwoAdapter.updateData(it)
    }
    val listellipsetwelveAdapter =
    ListellipsetwelveAdapter(viewModel.listellipsetwelveList.value?:mutableListOf())
    binding.recyclerListellipsetwelve.adapter = listellipsetwelveAdapter
    listellipsetwelveAdapter.setOnItemClickListener(
    object : ListellipsetwelveAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipsetwelveRowModel) {
        onClickRecyclerListellipsetwelve(view, position, item)
      }
    }
    )
    viewModel.listellipsetwelveList.observe(this) {
      listellipsetwelveAdapter.updateData(it)
    }
    binding.storiesAndTweetsVM = viewModel
    setUpSearchViewGroup9020Listener()
  }

  override fun setUpClicks(): Unit {


    binding.btnCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
  }

  fun onClickRecyclerListellipsetwentytwo(
    view: View,
    position: Int,
    item: ListellipsetwentytwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListellipsetwelve(
    view: View,
    position: Int,
    item: ListellipsetwelveRowModel
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
      const val TAG: String = "STORIES_AND_TWEETS_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, StoriesAndTweetsActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
