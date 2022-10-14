package com.houssameddinesapplication.app.modules.foryou.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.databinding.RowForYouBinding
import com.houssameddinesapplication.app.modules.foryou.`data`.model.ForYouRowModel
import kotlin.Int
import kotlin.collections.List

class ForYouAdapter(
  var list: List<ForYouRowModel>
) : RecyclerView.Adapter<ForYouAdapter.RowForYouVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowForYouVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_for_you,parent,false)
    return RowForYouVH(view)
  }

  override fun onBindViewHolder(holder: RowForYouVH, position: Int) {
    val forYouRowModel = ForYouRowModel()
    // TODO uncomment following line after integration with data source
    // val forYouRowModel = list[position]
    holder.binding.forYouRowModel = forYouRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ForYouRowModel>) {
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
      item: ForYouRowModel
    ) {
    }
  }

  inner class RowForYouVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowForYouBinding = RowForYouBinding.bind(itemView)
  }
}
