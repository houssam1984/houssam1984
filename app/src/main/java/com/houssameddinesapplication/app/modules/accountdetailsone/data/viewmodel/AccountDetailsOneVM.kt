package com.houssameddinesapplication.app.modules.accountdetailsone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.houssameddinesapplication.app.modules.accountdetailsone.`data`.model.AccountDetailsOneModel
import com.houssameddinesapplication.app.modules.accountdetailsone.`data`.model.Listellipsefifteen2RowModel
import com.houssameddinesapplication.app.modules.accountdetailsone.`data`.model.ListsixRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AccountDetailsOneVM : ViewModel(), KoinComponent {
  val accountDetailsOneModel: MutableLiveData<AccountDetailsOneModel> =
      MutableLiveData(AccountDetailsOneModel())

  var navArguments: Bundle? = null

  val listsixList: MutableLiveData<MutableList<ListsixRowModel>> = MutableLiveData(mutableListOf())

  val listellipsefifteenList: MutableLiveData<MutableList<Listellipsefifteen2RowModel>> =
      MutableLiveData(mutableListOf())
}
