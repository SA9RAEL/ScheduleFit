package com.example.schedulefit.model.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.schedulefit.model.room.dao.ScheduleDao
import com.example.schedulefit.model.room.entities.FitInfoEntity
import com.example.schedulefit.model.room.entities.LessonEntity
import com.example.schedulefit.model.room.entities.OptionEntity
import com.example.schedulefit.model.room.entities.TabEntity
import com.example.schedulefit.model.room.entities.TrainerEntity


@Database(
    version = 1,
    exportSchema = false,
    entities = [
        FitInfoEntity::class,
        LessonEntity::class,
        OptionEntity::class,
        TabEntity::class,
        TrainerEntity::class
    ]
)
abstract class ScheduleDatabase : RoomDatabase() {

    companion object {
        const val DB_NAME = "schedule_database"
    }

    abstract fun scheduleDao(): ScheduleDao
}