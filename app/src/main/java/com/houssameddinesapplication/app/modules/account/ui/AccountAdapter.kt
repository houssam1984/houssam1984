package com.houssameddinesapplication.app.modules.account.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.databinding.RowAccountBinding
import com.houssameddinesapplication.app.modules.account.`data`.model.AccountRowModel
import kotlin.Int
import kotlin.collections.List

class AccountAdapter(
  var list: List<AccountRowModel>
) : RecyclerView.Adapter<AccountAdapter.RowAccountVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAccountVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_account,parent,false)
    return RowAccountVH(view)
  }

  override fun onBindViewHolder(holder: RowAccountVH, position: Int) {
    val accountRowModel = AccountRowModel()
    // TODO uncomment following line after integration with data source
    // val accountRowModel = list[position]
    holder.binding.accountRowModel = accountRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<AccountRowModel>) {
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
      item: AccountRowModel
    ) {
    }
  }

  inner class RowAccountVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowAccountBinding = RowAccountBinding.bind(itemView)
  }
}
