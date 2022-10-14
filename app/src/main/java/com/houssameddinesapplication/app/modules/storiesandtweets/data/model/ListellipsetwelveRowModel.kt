package com.houssameddinesapplication.app.modules.storiesandtweets.`data`.model

import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ListellipsetwelveRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAlbertOconnor: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_albert_o_connor)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_hours_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtIntroduceIam: String? =
      MyApp.getInstance().resources.getString(R.string.msg_introduce_i_am)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_2200)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEightHundred: String? = MyApp.getInstance().resources.getString(R.string.lbl_800)

)
