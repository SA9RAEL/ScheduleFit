package com.example.schedulefit.presentation.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.fitnessshedule.databinding.ItemHeaderBinding
import com.example.schedulefit.presentation.models.LessonPresentation

class HeaderViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding: ItemHeaderBinding by viewBinding(ItemHeaderBinding::bind)

    fun bind(model: LessonPresentation) {
        with(binding) {
            itemHeader.text = model.date
        }
    }

}