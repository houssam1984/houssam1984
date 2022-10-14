package com.houssameddinesapplication.app.modules.account.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.houssameddinesapplication.app.modules.account.`data`.model.AccountModel
import com.houssameddinesapplication.app.modules.account.`data`.model.AccountRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AccountVM : ViewModel(), KoinComponent {
  val accountModel: MutableLiveData<AccountModel> = MutableLiveData(AccountModel())

  var navArguments: Bundle? = null

  val accountList: MutableLiveData<MutableList<AccountRowModel>> = MutableLiveData(mutableListOf())
}
