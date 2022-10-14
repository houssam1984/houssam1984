package com.houssameddinesapplication.app.modules.foryou1.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.base.BaseActivity
import com.houssameddinesapplication.app.databinding.ActivityForYou1Binding
import com.houssameddinesapplication.app.modules.foryou1.`data`.viewmodel.ForYou1VM
import kotlin.String
import kotlin.Unit

class ForYou1Activity : BaseActivity<ActivityForYou1Binding>(R.layout.activity_for_you1) {
  private val viewModel: ForYou1VM by viewModels<ForYou1VM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.forYou1VM = viewModel
    val adapter = ForYou1ActivityPagerAdapter(supportFragmentManager,lifecycle)
    binding.viewPagerTabbarview.adapter = adapter
    TabLayoutMediator(binding.tabLayoutGroup9148,binding.viewPagerTabbarview) { tab, position ->
      tab.text = ForYou1ActivityPagerAdapter.title[position]
      }.attach()
    }

    override fun setUpClicks(): Unit {
    }

    companion object {
      const val TAG: String = "FOR_YOU1ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, ForYou1Activity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
