package com.houssameddinesapplication.app.modules.invitefriends.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.base.BaseActivity
import com.houssameddinesapplication.app.databinding.ActivityInviteFriendsBinding
import com.houssameddinesapplication.app.modules.invitefriends.`data`.model.InviteFriendsRowModel
import com.houssameddinesapplication.app.modules.invitefriends.`data`.viewmodel.InviteFriendsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class InviteFriendsActivity :
    BaseActivity<ActivityInviteFriendsBinding>(R.layout.activity_invite_friends) {
  private val viewModel: InviteFriendsVM by viewModels<InviteFriendsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val inviteFriendsAdapter =
    InviteFriendsAdapter(viewModel.inviteFriendsList.value?:mutableListOf())
    binding.recyclerInviteFriends.adapter = inviteFriendsAdapter
    inviteFriendsAdapter.setOnItemClickListener(
    object : InviteFriendsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : InviteFriendsRowModel) {
        onClickRecyclerInviteFriends(view, position, item)
      }
    }
    )
    viewModel.inviteFriendsList.observe(this) {
      inviteFriendsAdapter.updateData(it)
    }
    binding.inviteFriendsVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerInviteFriends(
    view: View,
    position: Int,
    item: InviteFriendsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "INVITE_FRIENDS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, InviteFriendsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
