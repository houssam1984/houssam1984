package com.houssameddinesapplication.app.modules.account.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.base.BaseActivity
import com.houssameddinesapplication.app.databinding.ActivityAccountBinding
import com.houssameddinesapplication.app.modules.account.`data`.model.AccountRowModel
import com.houssameddinesapplication.app.modules.account.`data`.viewmodel.AccountVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AccountActivity : BaseActivity<ActivityAccountBinding>(R.layout.activity_account) {
  private val viewModel: AccountVM by viewModels<AccountVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val accountAdapter = AccountAdapter(viewModel.accountList.value?:mutableListOf())
    binding.recyclerAccount.adapter = accountAdapter
    accountAdapter.setOnItemClickListener(
    object : AccountAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : AccountRowModel) {
        onClickRecyclerAccount(view, position, item)
      }
    }
    )
    viewModel.accountList.observe(this) {
      accountAdapter.updateData(it)
    }
    binding.accountVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerAccount(
    view: View,
    position: Int,
    item: AccountRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ACCOUNT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AccountActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
