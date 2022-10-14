package com.houssameddinesapplication.app.modules.foryou.ui

import android.view.View
import androidx.fragment.app.viewModels
import com.houssameddinesapplication.app.R
import com.houssameddinesapplication.app.appcomponents.base.BaseFragment
import com.houssameddinesapplication.app.databinding.FragmentForYouBinding
import com.houssameddinesapplication.app.modules.foryou.`data`.model.ForYouRowModel
import com.houssameddinesapplication.app.modules.foryou.`data`.viewmodel.ForYouVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ForYouFragment : BaseFragment<FragmentForYouBinding>(R.layout.fragment_for_you) {
  private val viewModel: ForYouVM by viewModels<ForYouVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val forYouAdapter = ForYouAdapter(viewModel.forYouList.value?:mutableListOf())
    binding.recyclerForYou.adapter = forYouAdapter
    forYouAdapter.setOnItemClickListener(
    object : ForYouAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ForYouRowModel) {
        onClickRecyclerForYou(view, position, item)
      }
    }
    )
    viewModel.forYouList.observe(requireActivity()) {
      forYouAdapter.updateData(it)
    }
    binding.forYouVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerForYou(
    view: View,
    position: Int,
    item: ForYouRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FOR_YOU_FRAGMENT"

  }
}
