package com.houssameddinesapplication.app.modules.accountdetails.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.houssameddinesapplication.app.modules.accountdetails.`data`.model.AccountDetailsModel
import com.houssameddinesapplication.app.modules.accountdetails.`data`.model.Listellipsefifteen1RowModel
import com.houssameddinesapplication.app.modules.accountdetails.`data`.model.ListthreeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AccountDetailsVM : ViewModel(), KoinComponent {
  val accountDetailsModel: MutableLiveData<AccountDetailsModel> =
      MutableLiveData(AccountDetailsModel())

  var navArguments: Bundle? = null

  val listthreeList: MutableLiveData<MutableList<ListthreeRowModel>> =
      MutableLiveData(mutableListOf())

  val listellipsefifteenList: MutableLiveData<MutableList<Listellipsefifteen1RowModel>> =
      MutableLiveData(mutableListOf())
}
