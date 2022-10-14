package com.houssameddinesapplication.app.modules.splash.`data`.model

import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SplashModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtBdChat: String? = MyApp.getInstance().resources.getString(R.string.msg_base_de_donn_es)

)
