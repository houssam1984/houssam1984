package com.houssameddinesapplication.app.modules.messages.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.houssameddinesapplication.app.modules.messages.`data`.model.Listellipsefifteen3RowModel
import com.houssameddinesapplication.app.modules.messages.`data`.model.ListellipsetwentytwoOneRowModel
import com.houssameddinesapplication.app.modules.messages.`data`.model.MessagesModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class MessagesVM : ViewModel(), KoinComponent {
  val messagesModel: MutableLiveData<MessagesModel> = MutableLiveData(MessagesModel())

  var navArguments: Bundle? = null

  val listellipsefifteenList: MutableLiveData<MutableList<Listellipsefifteen3RowModel>> =
      MutableLiveData(mutableListOf())

  val listellipsetwentytwoOneList: MutableLiveData<MutableList<ListellipsetwentytwoOneRowModel>> =
      MutableLiveData(mutableListOf())
}
