package com.houssameddinesapplication.app.modules.stories.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.houssameddinesapplication.app.modules.stories.`data`.model.ListellipsefifteenRowModel
import com.houssameddinesapplication.app.modules.stories.`data`.model.Listnineteen1RowModel
import com.houssameddinesapplication.app.modules.stories.`data`.model.StoriesModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class StoriesVM : ViewModel(), KoinComponent {
  val storiesModel: MutableLiveData<StoriesModel> = MutableLiveData(StoriesModel())

  var navArguments: Bundle? = null

  val listellipsefifteenList: MutableLiveData<MutableList<ListellipsefifteenRowModel>> =
      MutableLiveData(mutableListOf())

  val listnineteenList: MutableLiveData<MutableList<Listnineteen1RowModel>> =
      MutableLiveData(mutableListOf())
}
