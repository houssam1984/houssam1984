package com.houssameddinesapplication.app.modules.accoutview.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.houssameddinesapplication.app.modules.accoutview.`data`.model.AccoutViewModel
import org.koin.core.KoinComponent

class AccoutViewVM : ViewModel(), KoinComponent {
  val accoutViewModel: MutableLiveData<AccoutViewModel> = MutableLiveData(AccoutViewModel())

  var navArguments: Bundle? = null
}
