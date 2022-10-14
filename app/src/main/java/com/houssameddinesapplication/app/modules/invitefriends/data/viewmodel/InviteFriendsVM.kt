package com.houssameddinesapplication.app.modules.invitefriends.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.houssameddinesapplication.app.modules.invitefriends.`data`.model.InviteFriendsModel
import com.houssameddinesapplication.app.modules.invitefriends.`data`.model.InviteFriendsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class InviteFriendsVM : ViewModel(), KoinComponent {
  val inviteFriendsModel: MutableLiveData<InviteFriendsModel> =
      MutableLiveData(InviteFriendsModel())

  var navArguments: Bundle? = null

  val inviteFriendsList: MutableLiveData<MutableList<InviteFriendsRowModel>> =
      MutableLiveData(mutableListOf())
}
