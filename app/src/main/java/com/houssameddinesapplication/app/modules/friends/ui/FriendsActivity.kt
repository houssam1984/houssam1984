package com.houssameddinesapplication.app.modules.friends.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.appcompat.widget.SearchView
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.base.BaseActivity
import com.houssameddinesapplication.app.databinding.ActivityFriendsBinding
import com.houssameddinesapplication.app.modules.friends.`data`.model.FriendsRowModel
import com.houssameddinesapplication.app.modules.friends.`data`.viewmodel.FriendsVM
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FriendsActivity : BaseActivity<ActivityFriendsBinding>(R.layout.activity_friends) {
  private val viewModel: FriendsVM by viewModels<FriendsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val friendsAdapter = FriendsAdapter(viewModel.friendsList.value?:mutableListOf())
    binding.recyclerFriends.adapter = friendsAdapter
    friendsAdapter.setOnItemClickListener(
    object : FriendsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FriendsRowModel) {
        onClickRecyclerFriends(view, position, item)
      }
    }
    )
    viewModel.friendsList.observe(this) {
      friendsAdapter.updateData(it)
    }
    binding.friendsVM = viewModel
    setUpSearchViewGroup9116Listener()
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerFriends(
    view: View,
    position: Int,
    item: FriendsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewGroup9116Listener(): Unit {
    binding.searchViewGroup9116.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "FRIENDS_ACTIVITY"


      fun getIntent(context: Context, bundle: Bundle?): Intent {
        val destIntent = Intent(context, FriendsActivity::class.java)
        destIntent.putExtra("bundle", bundle)
        return destIntent
      }
    }
  }
