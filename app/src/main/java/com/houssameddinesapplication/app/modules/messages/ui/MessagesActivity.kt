package com.houssameddinesapplication.app.modules.messages.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.base.BaseActivity
import com.houssameddinesapplication.app.databinding.ActivityMessagesBinding
import com.houssameddinesapplication.app.modules.messages.`data`.model.Listellipsefifteen3RowModel
import com.houssameddinesapplication.app.modules.messages.`data`.model.ListellipsetwentytwoOneRowModel
import com.houssameddinesapplication.app.modules.messages.`data`.viewmodel.MessagesVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class MessagesActivity : BaseActivity<ActivityMessagesBinding>(R.layout.activity_messages) {
  private val viewModel: MessagesVM by viewModels<MessagesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listellipsefifteenAdapter =
    ListellipsefifteenAdapter(viewModel.listellipsefifteenList.value?:mutableListOf())
    binding.recyclerListellipsefifteen.adapter = listellipsefifteenAdapter
    listellipsefifteenAdapter.setOnItemClickListener(
    object : ListellipsefifteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listellipsefifteen3RowModel) {
        onClickRecyclerListellipsefifteen(view, position, item)
      }
    }
    )
    viewModel.listellipsefifteenList.observe(this) {
      listellipsefifteenAdapter.updateData(it)
    }
    val listellipsetwentytwoOneAdapter =
    ListellipsetwentytwoOneAdapter(viewModel.listellipsetwentytwoOneList.value?:mutableListOf())
    binding.recyclerListellipsetwentytwoOne.adapter = listellipsetwentytwoOneAdapter
    listellipsetwentytwoOneAdapter.setOnItemClickListener(
    object : ListellipsetwentytwoOneAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item :
      ListellipsetwentytwoOneRowModel) {
        onClickRecyclerListellipsetwentytwoOne(view, position, item)
      }
    }
    )
    viewModel.listellipsetwentytwoOneList.observe(this) {
      listellipsetwentytwoOneAdapter.updateData(it)
    }
    binding.messagesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListellipsefifteen(
    view: View,
    position: Int,
    item: Listellipsefifteen3RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListellipsetwentytwoOne(
    view: View,
    position: Int,
    item: ListellipsetwentytwoOneRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "MESSAGES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, MessagesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
