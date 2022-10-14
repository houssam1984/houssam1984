package com.houssameddinesapplication.app.modules.foryou.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.houssameddinesapplication.app.modules.foryou.`data`.model.ForYouModel
import com.houssameddinesapplication.app.modules.foryou.`data`.model.ForYouRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ForYouVM : ViewModel(), KoinComponent {
  val forYouModel: MutableLiveData<ForYouModel> = MutableLiveData(ForYouModel())

  var navArguments: Bundle? = null

  val forYouList: MutableLiveData<MutableList<ForYouRowModel>> = MutableLiveData(mutableListOf())
}
