package com.houssameddinesapplication.app.modules.stories.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.base.BaseActivity
import com.houssameddinesapplication.app.databinding.ActivityStoriesBinding
import com.houssameddinesapplication.app.modules.stories.`data`.model.ListellipsefifteenRowModel
import com.houssameddinesapplication.app.modules.stories.`data`.model.Listnineteen1RowModel
import com.houssameddinesapplication.app.modules.stories.`data`.viewmodel.StoriesVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class StoriesActivity : BaseActivity<ActivityStoriesBinding>(R.layout.activity_stories) {
  private val viewModel: StoriesVM by viewModels<StoriesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipsefifteenAdapter =
    ListellipsefifteenAdapter(viewModel.listellipsefifteenList.value?:mutableListOf())
    binding.recyclerListellipsefifteen.adapter = listellipsefifteenAdapter
    listellipsefifteenAdapter.setOnItemClickListener(
    object : ListellipsefifteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListellipsefifteenRowModel) {
        onClickRecyclerListellipsefifteen(view, position, item)
      }
    }
    )
    viewModel.listellipsefifteenList.observe(this) {
      listellipsefifteenAdapter.updateData(it)
    }
    val listnineteenAdapter =
    ListnineteenAdapter(viewModel.listnineteenList.value?:mutableListOf())
    binding.recyclerListnineteen.adapter = listnineteenAdapter
    listnineteenAdapter.setOnItemClickListener(
    object : ListnineteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listnineteen1RowModel) {
        onClickRecyclerListnineteen(view, position, item)
      }
    }
    )
    viewModel.listnineteenList.observe(this) {
      listnineteenAdapter.updateData(it)
    }
    binding.storiesVM = viewModel
    setUpSearchViewGroup9020Listener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListellipsefifteen(
    view: View,
    position: Int,
    item: ListellipsefifteenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListnineteen(
    view: View,
    position: Int,
    item: Listnineteen1RowModel
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
      const val TAG: String = "STORIES_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, StoriesActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
