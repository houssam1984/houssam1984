package com.houssameddinesapplication.app.modules.storiesandtweets.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.databinding.RowListellipsetwelveBinding
import com.houssameddinesapplication.app.modules.storiesandtweets.`data`.model.ListellipsetwelveRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipsetwelveAdapter(
  var list: List<ListellipsetwelveRowModel>
) : RecyclerView.Adapter<ListellipsetwelveAdapter.RowListellipsetwelveVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipsetwelveVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipsetwelve,parent,false)
    return RowListellipsetwelveVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipsetwelveVH, position: Int) {
    val listellipsetwelveRowModel = ListellipsetwelveRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipsetwelveRowModel = list[position]
    holder.binding.listellipsetwelveRowModel = listellipsetwelveRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipsetwelveRowModel>) {
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
      item: ListellipsetwelveRowModel
    ) {
    }
  }

  inner class RowListellipsetwelveVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipsetwelveBinding = RowListellipsetwelveBinding.bind(itemView)
    init {
      binding.btnFollow.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, ListellipsetwelveRowModel())
      }
    }
  }
}
