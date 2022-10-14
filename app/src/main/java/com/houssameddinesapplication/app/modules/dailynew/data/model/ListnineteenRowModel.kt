package com.houssameddinesapplication.app.modules.dailynew.`data`.model

import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListnineteenRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAgnessMonica: String? = MyApp.getInstance().resources.getString(R.string.lbl_agness_monica)

)
