package com.houssameddinesapplication.app.modules.filters.`data`.model

import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FiltersModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtType: String? = MyApp.getInstance().resources.getString(R.string.lbl_type)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLive: String? = MyApp.getInstance().resources.getString(R.string.lbl_live)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNormal: String? = MyApp.getInstance().resources.getString(R.string.lbl_normal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZoom: String? = MyApp.getInstance().resources.getString(R.string.lbl_zoom)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFood: String? = MyApp.getInstance().resources.getString(R.string.lbl_food)

)
