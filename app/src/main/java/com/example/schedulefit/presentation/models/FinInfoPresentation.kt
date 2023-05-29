package com.example.schedulefit.presentation.models

import com.example.schedulefit.model.room.entities.LessonEntity
import com.example.schedulefit.model.room.entities.OptionEntity
import com.example.schedulefit.model.room.entities.TabEntity
import com.example.schedulefit.model.room.entities.TrainerEntity
import com.example.schedulefit.presentation.ListPresentationModel

data class FitInfoPresentation(
    override val id: Int,
    val lessons: List<LessonPresentation>,
    val option: OptionEntity,
    val tabs: List<TabPresentation>,
    val trainers: List<TrainerPresentation>
) : ListPresentationModel