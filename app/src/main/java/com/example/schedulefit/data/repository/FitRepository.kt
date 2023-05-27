package com.example.schedulefit.data.repository

import androidx.lifecycle.LiveData
import com.example.schedulefit.data.mapper.FitMapper
import com.example.schedulefit.model.room.ScheduleDatabase
import com.example.schedulefit.model.room.entities.FitInfoEntity
import com.example.schedulefit.network.ScheduleApiService
import retrofit2.HttpException
import javax.inject.Inject

class FitRepository @Inject constructor(
    private val database: ScheduleDatabase,
    private val fitMapper: FitMapper,
    private val api: ScheduleApiService
) {

    val fitLessonsInfo: LiveData<List<FitInfoEntity>> by lazy { database.scheduleDao().getAllLessons() }

    suspend fun getFitLessonInfo(): Result<FitInfoEntity> {
        return try {
            val fitResponse = api.getSchedule()
            run {
                val info = fitMapper(fitResponse)
                database.scheduleDao().insert(info)
                Result.success(info)
            }
        } catch (e: HttpException) {
            Result.failure(e)
        }
    }

}