package com.houssameddinesapplication.app.modules.trendingposts1.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.houssameddinesapplication.app.modules.trendingposts1.`data`.model.TrendingPosts1Model
import org.koin.core.KoinComponent

class TrendingPosts1VM : ViewModel(), KoinComponent {
  val trendingPosts1Model: MutableLiveData<TrendingPosts1Model> =
      MutableLiveData(TrendingPosts1Model())

  var navArguments: Bundle? = null
}
