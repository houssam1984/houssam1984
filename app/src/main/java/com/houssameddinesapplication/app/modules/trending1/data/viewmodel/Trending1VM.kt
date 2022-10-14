package com.houssameddinesapplication.app.modules.trending1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.houssameddinesapplication.app.modules.trending1.`data`.model.Trending1Model
import com.houssameddinesapplication.app.modules.trending1.`data`.model.Trending1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class Trending1VM : ViewModel(), KoinComponent {
  val trending1Model: MutableLiveData<Trending1Model> = MutableLiveData(Trending1Model())

  var navArguments: Bundle? = null

  val trendingList: MutableLiveData<MutableList<Trending1RowModel>> =
      MutableLiveData(mutableListOf())
}
