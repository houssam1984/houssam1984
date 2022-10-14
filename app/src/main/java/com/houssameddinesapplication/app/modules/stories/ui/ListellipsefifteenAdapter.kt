package com.houssameddinesapplication.app.modules.stories.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.databinding.RowListellipsefifteenBinding
import com.houssameddinesapplication.app.modules.stories.`data`.model.ListellipsefifteenRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipsefifteenAdapter(
  var list: List<ListellipsefifteenRowModel>
) : RecyclerView.Adapter<ListellipsefifteenAdapter.RowListellipsefifteenVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipsefifteenVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipsefifteen,parent,false)
    return RowListellipsefifteenVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipsefifteenVH, position: Int) {
    val listellipsefifteenRowModel = ListellipsefifteenRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipsefifteenRowModel = list[position]
    holder.binding.listellipsefifteenRowModel = listellipsefifteenRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipsefifteenRowModel>) {
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
      item: ListellipsefifteenRowModel
    ) {
    }
  }

  inner class RowListellipsefifteenVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipsefifteenBinding = RowListellipsefifteenBinding.bind(itemView)
  }
}
