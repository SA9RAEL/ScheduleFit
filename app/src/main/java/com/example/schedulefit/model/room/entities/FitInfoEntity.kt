package com.example.schedulefit.model.room.entities

import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "schedule_table")
data class FitInfoEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    @ColumnInfo(name = "lessons")
    val lessons: List<LessonEntity>,
    @Embedded
    val option: OptionEntity,
    @ColumnInfo(name = "tabs")
    val tabs: List<TabEntity>,
    @ColumnInfo(name = "trainers")
    val trainers: List<TrainerEntity>
)