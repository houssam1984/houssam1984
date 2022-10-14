package com.houssameddinesapplication.app.modules.accountdetails.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.databinding.RowListthreeBinding
import com.houssameddinesapplication.app.modules.accountdetails.`data`.model.ListthreeRowModel
import kotlin.Int
import kotlin.collections.List

class ListthreeAdapter(
  var list: List<ListthreeRowModel>
) : RecyclerView.Adapter<ListthreeAdapter.RowListthreeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListthreeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listthree,parent,false)
    return RowListthreeVH(view)
  }

  override fun onBindViewHolder(holder: RowListthreeVH, position: Int) {
    val listthreeRowModel = ListthreeRowModel()
    // TODO uncomment following line after integration with data source
    // val listthreeRowModel = list[position]
    holder.binding.listthreeRowModel = listthreeRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListthreeRowModel>) {
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
      item: ListthreeRowModel
    ) {
    }
  }

  inner class RowListthreeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListthreeBinding = RowListthreeBinding.bind(itemView)
  }
}
