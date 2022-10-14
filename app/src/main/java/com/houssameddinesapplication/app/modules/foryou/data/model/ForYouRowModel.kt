package com.houssameddinesapplication.app.modules.foryou.`data`.model

import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ForYouRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtElisaCarl: String? = MyApp.getInstance().resources.getString(R.string.lbl_elisa_carl)

)
