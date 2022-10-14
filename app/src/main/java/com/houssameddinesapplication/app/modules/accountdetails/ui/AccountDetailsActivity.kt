package com.houssameddinesapplication.app.modules.accountdetails.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.base.BaseActivity
import com.houssameddinesapplication.app.databinding.ActivityAccountDetailsBinding
import com.houssameddinesapplication.app.modules.accountdetails.`data`.model.Listellipsefifteen1RowModel
import com.houssameddinesapplication.app.modules.accountdetails.`data`.model.ListthreeRowModel
import com.houssameddinesapplication.app.modules.accountdetails.`data`.viewmodel.AccountDetailsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AccountDetailsActivity :
    BaseActivity<ActivityAccountDetailsBinding>(R.layout.activity_account_details) {
  private val viewModel: AccountDetailsVM by viewModels<AccountDetailsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listthreeAdapter = ListthreeAdapter(viewModel.listthreeList.value?:mutableListOf())
    binding.recyclerListthree.adapter = listthreeAdapter
    listthreeAdapter.setOnItemClickListener(
    object : ListthreeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListthreeRowModel) {
        onClickRecyclerListthree(view, position, item)
      }
    }
    )
    viewModel.listthreeList.observe(this) {
      listthreeAdapter.updateData(it)
    }
    val listellipsefifteenAdapter =
    ListellipsefifteenAdapter(viewModel.listellipsefifteenList.value?:mutableListOf())
    binding.recyclerListellipsefifteen.adapter = listellipsefifteenAdapter
    listellipsefifteenAdapter.setOnItemClickListener(
    object : ListellipsefifteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listellipsefifteen1RowModel) {
        onClickRecyclerListellipsefifteen(view, position, item)
      }
    }
    )
    viewModel.listellipsefifteenList.observe(this) {
      listellipsefifteenAdapter.updateData(it)
    }
    binding.accountDetailsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListthree(
    view: View,
    position: Int,
    item: ListthreeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListellipsefifteen(
    view: View,
    position: Int,
    item: Listellipsefifteen1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ACCOUNT_DETAILS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountDetailsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
