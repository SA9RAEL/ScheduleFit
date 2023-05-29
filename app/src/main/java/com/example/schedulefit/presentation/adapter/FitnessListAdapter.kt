package com.example.schedulefit.presentation.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.fitnessshedule.R
import com.example.schedulefit.presentation.ListPresentationModel
import com.example.schedulefit.presentation.models.FitInfoPresentation
import com.example.schedulefit.presentation.models.LessonPresentation

class FitnessListAdapter :
    ListAdapter<ListPresentationModel, RecyclerView.ViewHolder>(LESSONS_COMPARATOR) {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder = when (viewType) {
        VIEW_TYPE_HEADER -> HeaderViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_header, parent, false)
        )

        VIEW_TYPE_CONTENT -> ContentViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_content, parent, false)
        )

        else -> throw IllegalArgumentException("Invalid View Holder")
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is HeaderViewHolder -> holder.bind(getItem(position) as LessonPresentation)
            is ContentViewHolder -> holder.bind(getItem(position) as FitInfoPresentation)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return when (getItem(position)) {
            is LessonPresentation -> VIEW_TYPE_HEADER
            else -> VIEW_TYPE_CONTENT
        }
    }

    companion object {

        private const val VIEW_TYPE_HEADER = 0
        private const val VIEW_TYPE_CONTENT = 1

        private val LESSONS_COMPARATOR = object : DiffUtil.ItemCallback<ListPresentationModel>() {
            override fun areItemsTheSame(
                oldItem: ListPresentationModel,
                newItem: ListPresentationModel
            ): Boolean {
                return oldItem.id == newItem.id
            }

            @SuppressLint("DiffUtilEquals")
            override fun areContentsTheSame(
                oldItem: ListPresentationModel,
                newItem: ListPresentationModel
            ): Boolean {
                return oldItem == newItem
            }
        }
    }

}