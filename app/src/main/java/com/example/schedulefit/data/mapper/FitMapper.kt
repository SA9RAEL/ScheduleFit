package com.example.schedulefit.data.mapper

import com.example.schedulefit.data.model.FitInfoResponse
import com.example.schedulefit.data.model.map
import com.example.schedulefit.model.room.entities.FitInfoEntity
import javax.inject.Inject

class FitMapper @Inject constructor() : (FitInfoResponse) -> FitInfoEntity {
    override fun invoke(fitInfoResponse: FitInfoResponse): FitInfoEntity {
        return with(fitInfoResponse) {
            FitInfoEntity(
                option = option.map(),
                lessons = lessons.map { it.map() },
                tabs = tabs.map { it.map() },
                trainers = trainers.map { it.map() }
            )
        }
    }
}