package com.example.schedulefit.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.fitnessshedule.databinding.ItemContentBinding
import com.example.schedulefit.presentation.models.FitInfoPresentation

class ContentViewHolder (view: View) : RecyclerView.ViewHolder(view) {

    private val binding: ItemContentBinding by viewBinding(ItemContentBinding::bind)

    fun bind(model: FitInfoPresentation) {
        with(binding) {

        }
    }
}