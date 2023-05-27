package com.example.schedulefit.model.room.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.schedulefit.model.room.entities.FitInfoEntity

@Dao
interface ScheduleDao {

    @Query("SELECT * FROM schedule_table")
    fun getAllLessons(): LiveData<List<FitInfoEntity>>

    @Insert
    suspend fun insert(fitInfo: FitInfoEntity)

}