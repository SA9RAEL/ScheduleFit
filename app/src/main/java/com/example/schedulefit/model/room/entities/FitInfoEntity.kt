package com.example.schedulefit.model.room.entities

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "schedule_table")
data class FitInfoEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @Embedded
    val lessons: List<LessonEntity>,
    @Embedded
    val option: OptionEntity,
    @Embedded
    val tabs: List<TabEntity>,
    @Embedded
    val trainers: List<TrainerEntity>
)

