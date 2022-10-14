package com.houssameddinesapplication.app.modules.storiesandtweets.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.databinding.RowListellipsetwentytwoBinding
import com.houssameddinesapplication.app.modules.storiesandtweets.`data`.model.ListellipsetwentytwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipsetwentytwoAdapter(
  var list: List<ListellipsetwentytwoRowModel>
) : RecyclerView.Adapter<ListellipsetwentytwoAdapter.RowListellipsetwentytwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipsetwentytwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipsetwentytwo,parent,false)
    return RowListellipsetwentytwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipsetwentytwoVH, position: Int) {
    val listellipsetwentytwoRowModel = ListellipsetwentytwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipsetwentytwoRowModel = list[position]
    holder.binding.listellipsetwentytwoRowModel = listellipsetwentytwoRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipsetwentytwoRowModel>) {
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
      item: ListellipsetwentytwoRowModel
    ) {
    }
  }

  inner class RowListellipsetwentytwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipsetwentytwoBinding = RowListellipsetwentytwoBinding.bind(itemView)
  }
}
