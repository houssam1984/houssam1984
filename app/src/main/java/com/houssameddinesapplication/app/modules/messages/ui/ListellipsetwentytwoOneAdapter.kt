package com.houssameddinesapplication.app.modules.messages.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.databinding.RowListellipsetwentytwoOneBinding
import com.houssameddinesapplication.app.modules.messages.`data`.model.ListellipsetwentytwoOneRowModel
import kotlin.Int
import kotlin.collections.List

class ListellipsetwentytwoOneAdapter(
  var list: List<ListellipsetwentytwoOneRowModel>
) : RecyclerView.Adapter<ListellipsetwentytwoOneAdapter.RowListellipsetwentytwoOneVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListellipsetwentytwoOneVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listellipsetwentytwo_one,parent,false)
    return RowListellipsetwentytwoOneVH(view)
  }

  override fun onBindViewHolder(holder: RowListellipsetwentytwoOneVH, position: Int) {
    val listellipsetwentytwoOneRowModel = ListellipsetwentytwoOneRowModel()
    // TODO uncomment following line after integration with data source
    // val listellipsetwentytwoOneRowModel = list[position]
    holder.binding.listellipsetwentytwoOneRowModel = listellipsetwentytwoOneRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListellipsetwentytwoOneRowModel>) {
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
      item: ListellipsetwentytwoOneRowModel
    ) {
    }
  }

  inner class RowListellipsetwentytwoOneVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListellipsetwentytwoOneBinding =
        RowListellipsetwentytwoOneBinding.bind(itemView)
  }
}
