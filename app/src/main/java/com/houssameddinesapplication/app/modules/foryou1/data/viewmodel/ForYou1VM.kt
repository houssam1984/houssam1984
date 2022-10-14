package com.houssameddinesapplication.app.modules.foryou1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.houssameddinesapplication.app.modules.foryou1.`data`.model.ForYou1Model
import org.koin.core.KoinComponent

class ForYou1VM : ViewModel(), KoinComponent {
  val forYou1Model: MutableLiveData<ForYou1Model> = MutableLiveData(ForYou1Model())

  var navArguments: Bundle? = null
}
