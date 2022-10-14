package com.houssameddinesapplication.app.modules.live.`data`.model

import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LiveModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_lucas_anna)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txt3516: String? = MyApp.getInstance().resources.getString(R.string.lbl_35_16)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtErlikheSweetC: String? =
      MyApp.getInstance().resources.getString(R.string.msg_erlikhe_sweet_c)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDongKhuwanSo: String? =
      MyApp.getInstance().resources.getString(R.string.msg_dong_khuwan_so)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtySixValue: String? = null
)
