package com.houssameddinesapplication.app.modules.dailynew.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.houssameddinesapplication.app.modules.dailynew.`data`.model.DailyNewModel
import com.houssameddinesapplication.app.modules.dailynew.`data`.model.ListnineteenRowModel
import com.houssameddinesapplication.app.modules.dailynew.`data`.model.ListoneRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class DailyNewVM : ViewModel(), KoinComponent {
  val dailyNewModel: MutableLiveData<DailyNewModel> = MutableLiveData(DailyNewModel())

  var navArguments: Bundle? = null

  val listnineteenList: MutableLiveData<MutableList<ListnineteenRowModel>> =
      MutableLiveData(mutableListOf())

  val listoneList: MutableLiveData<MutableList<ListoneRowModel>> = MutableLiveData(mutableListOf())
}
