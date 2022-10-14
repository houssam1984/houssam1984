package com.houssameddinesapplication.app.modules.trendingposts.ui

import androidx.fragment.app.viewModels
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.base.BaseFragment
import com.houssameddinesapplication.app.databinding.FragmentTrendingPostsBinding
import com.houssameddinesapplication.app.modules.trendingposts.`data`.viewmodel.TrendingPostsVM
import kotlin.String
import kotlin.Unit

class TrendingPostsFragment :
    BaseFragment<FragmentTrendingPostsBinding>(R.layout.fragment_trending_posts) {
  private val viewModel: TrendingPostsVM by viewModels<TrendingPostsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.trendingPostsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "TRENDING_POSTS_FRAGMENT"

  }
}
