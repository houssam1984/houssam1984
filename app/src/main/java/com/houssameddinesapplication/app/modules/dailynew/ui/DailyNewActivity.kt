package com.houssameddinesapplication.app.modules.dailynew.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.base.BaseActivity
import com.houssameddinesapplication.app.databinding.ActivityDailyNewBinding
import com.houssameddinesapplication.app.modules.dailynew.`data`.model.ListnineteenRowModel
import com.houssameddinesapplication.app.modules.dailynew.`data`.model.ListoneRowModel
import com.houssameddinesapplication.app.modules.dailynew.`data`.viewmodel.DailyNewVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class DailyNewActivity : BaseActivity<ActivityDailyNewBinding>(R.layout.activity_daily_new) {
  private val viewModel: DailyNewVM by viewModels<DailyNewVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listnineteenAdapter =
    ListnineteenAdapter(viewModel.listnineteenList.value?:mutableListOf())
    binding.recyclerListnineteen.adapter = listnineteenAdapter
    listnineteenAdapter.setOnItemClickListener(
    object : ListnineteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListnineteenRowModel) {
        onClickRecyclerListnineteen(view, position, item)
      }
    }
    )
    viewModel.listnineteenList.observe(this) {
      listnineteenAdapter.updateData(it)
    }
    val listoneAdapter = ListoneAdapter(viewModel.listoneList.value?:mutableListOf())
    binding.recyclerListone.adapter = listoneAdapter
    listoneAdapter.setOnItemClickListener(
    object : ListoneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListoneRowModel) {
        onClickRecyclerListone(view, position, item)
      }
    }
    )
    viewModel.listoneList.observe(this) {
      listoneAdapter.updateData(it)
    }
    binding.dailyNewVM = viewModel
    setUpSearchViewGroup9020Listener()
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerListnineteen(
    view: View,
    position: Int,
    item: ListnineteenRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListone(
    view: View,
    position: Int,
    item: ListoneRowModel
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
      const val TAG: String = "DAILY_NEW_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, DailyNewActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
