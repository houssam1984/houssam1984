package com.houssameddinesapplication.app.modules.dailynew.`data`.model

import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.di.MyApp
import kotlin.String

data class DailyNewModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDailyNew: String? = MyApp.getInstance().resources.getString(R.string.lbl_daily_new)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAvariKudhra: String? = MyApp.getInstance().resources.getString(R.string.lbl_avari_kudhra)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDuration: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_hour_ago)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThisisavery: String? = MyApp.getInstance().resources.getString(R.string.msg_this_is_a_very)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAnimal: String? = MyApp.getInstance().resources.getString(R.string.lbl_animal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForest: String? = MyApp.getInstance().resources.getString(R.string.lbl_forest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRabbit: String? = MyApp.getInstance().resources.getString(R.string.lbl_rabbit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtStreams: String? = MyApp.getInstance().resources.getString(R.string.lbl_streams)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMessages: String? = MyApp.getInstance().resources.getString(R.string.lbl_messages)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNotifications: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_notifications)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)

)
