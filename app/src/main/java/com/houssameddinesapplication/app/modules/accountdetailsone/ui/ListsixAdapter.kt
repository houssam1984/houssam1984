package com.houssameddinesapplication.app.modules.accountdetailsone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.databinding.RowListsixBinding
import com.houssameddinesapplication.app.modules.accountdetailsone.`data`.model.ListsixRowModel
import kotlin.Int
import kotlin.collections.List

class ListsixAdapter(
  var list: List<ListsixRowModel>
) : RecyclerView.Adapter<ListsixAdapter.RowListsixVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListsixVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listsix,parent,false)
    return RowListsixVH(view)
  }

  override fun onBindViewHolder(holder: RowListsixVH, position: Int) {
    val listsixRowModel = ListsixRowModel()
    // TODO uncomment following line after integration with data source
    // val listsixRowModel = list[position]
    holder.binding.listsixRowModel = listsixRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListsixRowModel>) {
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
      item: ListsixRowModel
    ) {
    }
  }

  inner class RowListsixVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListsixBinding = RowListsixBinding.bind(itemView)
  }
}
