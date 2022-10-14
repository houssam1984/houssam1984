package com.houssameddinesapplication.app.modules.invitefriends.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.databinding.RowInviteFriendsBinding
import com.houssameddinesapplication.app.modules.invitefriends.`data`.model.InviteFriendsRowModel
import kotlin.Int
import kotlin.collections.List

class InviteFriendsAdapter(
  var list: List<InviteFriendsRowModel>
) : RecyclerView.Adapter<InviteFriendsAdapter.RowInviteFriendsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowInviteFriendsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_invite_friends,parent,false)
    return RowInviteFriendsVH(view)
  }

  override fun onBindViewHolder(holder: RowInviteFriendsVH, position: Int) {
    val inviteFriendsRowModel = InviteFriendsRowModel()
    // TODO uncomment following line after integration with data source
    // val inviteFriendsRowModel = list[position]
    holder.binding.inviteFriendsRowModel = inviteFriendsRowModel
  }

  override fun getItemCount(): Int = 9
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<InviteFriendsRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: InviteFriendsRowModel
    ) {
    }
  }

  inner class RowInviteFriendsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowInviteFriendsBinding = RowInviteFriendsBinding.bind(itemView)
  }
}
