package com.houssameddinesapplication.app.modules.login.`data`.model

import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LogInModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtWelcometoSoci: String? =
      MyApp.getInstance().resources.getString(R.string.msg_welcome_to_soci2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLoginyouracco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_login_your_acco)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotPassword: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_password)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtyValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etFrameThirtyOneValue: String? = null
)
