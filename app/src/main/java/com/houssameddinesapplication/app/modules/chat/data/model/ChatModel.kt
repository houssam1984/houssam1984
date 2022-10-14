package com.houssameddinesapplication.app.modules.chat.`data`.model

import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ChatModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtGarryWiller: String? = MyApp.getInstance().resources.getString(R.string.lbl_garry_willer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDelivered: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivered)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloGerryim: String? =
      MyApp.getInstance().resources.getString(R.string.msg_hello_gerry_i_m)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDeliveredOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_delivered)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtySixValue: String? = null
)
