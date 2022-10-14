package com.houssameddinesapplication.app.modules.accountdetailsone.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.base.BaseActivity
import com.houssameddinesapplication.app.databinding.ActivityAccountDetailsOneBinding
import com.houssameddinesapplication.app.modules.accountdetailsone.`data`.model.Listellipsefifteen2RowModel
import com.houssameddinesapplication.app.modules.accountdetailsone.`data`.model.ListsixRowModel
import com.houssameddinesapplication.app.modules.accountdetailsone.`data`.viewmodel.AccountDetailsOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AccountDetailsOneActivity :
    BaseActivity<ActivityAccountDetailsOneBinding>(R.layout.activity_account_details_one) {
  private val viewModel: AccountDetailsOneVM by viewModels<AccountDetailsOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listsixAdapter = ListsixAdapter(viewModel.listsixList.value?:mutableListOf())
    binding.recyclerListsix.adapter = listsixAdapter
    listsixAdapter.setOnItemClickListener(
    object : ListsixAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListsixRowModel) {
        onClickRecyclerListsix(view, position, item)
      }
    }
    )
    viewModel.listsixList.observe(this) {
      listsixAdapter.updateData(it)
    }
    val listellipsefifteenAdapter =
    ListellipsefifteenAdapter(viewModel.listellipsefifteenList.value?:mutableListOf())
    binding.recyclerListellipsefifteen.adapter = listellipsefifteenAdapter
    listellipsefifteenAdapter.setOnItemClickListener(
    object : ListellipsefifteenAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listellipsefifteen2RowModel) {
        onClickRecyclerListellipsefifteen(view, position, item)
      }
    }
    )
    viewModel.listellipsefifteenList.observe(this) {
      listellipsefifteenAdapter.updateData(it)
    }
    binding.accountDetailsOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListsix(
    view: View,
    position: Int,
    item: ListsixRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListellipsefifteen(
    view: View,
    position: Int,
    item: Listellipsefifteen2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ACCOUNT_DETAILS_ONE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountDetailsOneActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
