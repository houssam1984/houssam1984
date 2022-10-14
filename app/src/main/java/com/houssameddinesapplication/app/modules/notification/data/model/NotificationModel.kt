package com.houssameddinesapplication.app.modules.notification.`data`.model

import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTurnonNotific: String? =
      MyApp.getInstance().resources.getString(R.string.msg_turn_on_notific2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTurnonnotificOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_turn_on_notific)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)

)
