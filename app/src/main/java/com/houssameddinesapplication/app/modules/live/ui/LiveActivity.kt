package com.houssameddinesapplication.app.modules.live.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.base.BaseActivity
import com.houssameddinesapplication.app.databinding.ActivityLiveBinding
import com.houssameddinesapplication.app.modules.live.`data`.viewmodel.LiveVM
import kotlin.String
import kotlin.Unit

class LiveActivity : BaseActivity<ActivityLiveBinding>(R.layout.activity_live) {
  private val viewModel: LiveVM by viewModels<LiveVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.liveVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "LIVE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, LiveActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
