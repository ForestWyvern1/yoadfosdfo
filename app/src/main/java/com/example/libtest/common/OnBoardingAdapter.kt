package com.example.libtest.common

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.libtest.R
import com.example.libtest.databinding.ItemViewOnboardingBinding

class OnBoardingAdapter(private val context: Context, private val dataList: ArrayList<String>) :
    RecyclerView.Adapter<OnBoardingAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder = ViewHolder(
        LayoutInflater
            .from(context)
            .inflate(R.layout.item_view_onboarding, parent, false)
    )

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val binding = ItemViewOnboardingBinding.bind(holder.itemView)

        binding.onboardingText.text = dataList[position]

    }

    override fun getItemCount(): Int = dataList.size

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}