package com.example.schedulefit.network

import com.example.schedulefit.data.model.FitInfoResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ScheduleApiService {
    @GET("schedule/get_v3/")
    fun getSchedule(
        @Query("club_id") clubId: Int = 2
    ): FitInfoResponse

}