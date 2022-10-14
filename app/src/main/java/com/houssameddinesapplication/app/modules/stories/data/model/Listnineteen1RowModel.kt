package com.houssameddinesapplication.app.modules.stories.`data`.model

import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class Listnineteen1RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLIVEOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_live2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLIVEWeTheF: String? = MyApp.getInstance().resources.getString(R.string.msg_live_we_the_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_19_00_forg)

)
