package com.houssameddinesapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.base.BaseActivity
import com.houssameddinesapplication.app.databinding.ActivityAppNavigationBinding
import com.houssameddinesapplication.app.modules.account.ui.AccountActivity
import com.houssameddinesapplication.app.modules.accountdetails.ui.AccountDetailsActivity
import com.houssameddinesapplication.app.modules.accountdetailsone.ui.AccountDetailsOneActivity
import com.houssameddinesapplication.app.modules.accoutview.ui.AccoutViewActivity
import com.houssameddinesapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.houssameddinesapplication.app.modules.chat.ui.ChatActivity
import com.houssameddinesapplication.app.modules.comments.ui.CommentsActivity
import com.houssameddinesapplication.app.modules.dailynew.ui.DailyNewActivity
import com.houssameddinesapplication.app.modules.detailedprofile.ui.DetailedProfileActivity
import com.houssameddinesapplication.app.modules.discover.ui.DiscoverActivity
import com.houssameddinesapplication.app.modules.filters.ui.FiltersActivity
import com.houssameddinesapplication.app.modules.forgotpassword.ui.ForgotPasswordActivity
import com.houssameddinesapplication.app.modules.foryou1.ui.ForYou1Activity
import com.houssameddinesapplication.app.modules.friends.ui.FriendsActivity
import com.houssameddinesapplication.app.modules.invitefriends.ui.InviteFriendsActivity
import com.houssameddinesapplication.app.modules.live.ui.LiveActivity
import com.houssameddinesapplication.app.modules.login.ui.LogInActivity
import com.houssameddinesapplication.app.modules.loginscreen.ui.LoginScreenActivity
import com.houssameddinesapplication.app.modules.messages.ui.MessagesActivity
import com.houssameddinesapplication.app.modules.notification.ui.NotificationActivity
import com.houssameddinesapplication.app.modules.notifications.ui.NotificationsActivity
import com.houssameddinesapplication.app.modules.pageview.ui.PageViewActivity
import com.houssameddinesapplication.app.modules.profile.ui.ProfileActivity
import com.houssameddinesapplication.app.modules.search.ui.SearchActivity
import com.houssameddinesapplication.app.modules.signup.ui.SignUpActivity
import com.houssameddinesapplication.app.modules.splash.ui.SplashActivity
import com.houssameddinesapplication.app.modules.stories.ui.StoriesActivity
import com.houssameddinesapplication.app.modules.storiesandtweets.ui.StoriesAndTweetsActivity
import com.houssameddinesapplication.app.modules.trending1.ui.Trending1Activity
import com.houssameddinesapplication.app.modules.trendingposts1.ui.TrendingPosts1Activity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearDiscover.setOnClickListener {
      val destIntent = DiscoverActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAccountDetails.setOnClickListener {
      val destIntent = AccountDetailsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLoginScreen.setOnClickListener {
      val destIntent = LoginScreenActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTrending.setOnClickListener {
      val destIntent = Trending1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAccountDetailsOne.setOnClickListener {
      val destIntent = AccountDetailsOneActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearMessages.setOnClickListener {
      val destIntent = MessagesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNotifications.setOnClickListener {
      val destIntent = NotificationsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearComments.setOnClickListener {
      val destIntent = CommentsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSignUp.setOnClickListener {
      val destIntent = SignUpActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFriends.setOnClickListener {
      val destIntent = FriendsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearForgotPassword.setOnClickListener {
      val destIntent = ForgotPasswordActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearStoriesAndTweets.setOnClickListener {
      val destIntent = StoriesAndTweetsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearInviteFriends.setOnClickListener {
      val destIntent = InviteFriendsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSplash.setOnClickListener {
      val destIntent = SplashActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSearch.setOnClickListener {
      val destIntent = SearchActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPageView.setOnClickListener {
      val destIntent = PageViewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDailyNew.setOnClickListener {
      val destIntent = DailyNewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAccount.setOnClickListener {
      val destIntent = AccountActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearNotification.setOnClickListener {
      val destIntent = NotificationActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearDetailedProfile.setOnClickListener {
      val destIntent = DetailedProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogIn.setOnClickListener {
      val destIntent = LogInActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearStories.setOnClickListener {
      val destIntent = StoriesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLive.setOnClickListener {
      val destIntent = LiveActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearForYou.setOnClickListener {
      val destIntent = ForYou1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearChat.setOnClickListener {
      val destIntent = ChatActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearProfile.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAccoutView.setOnClickListener {
      val destIntent = AccoutViewActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFilters.setOnClickListener {
      val destIntent = FiltersActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTrendingPosts.setOnClickListener {
      val destIntent = TrendingPosts1Activity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
