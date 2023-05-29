package com.example.schedulefit.data.mapper

import com.example.schedulefit.model.room.entities.FitInfoEntity
import com.example.schedulefit.model.room.entities.map
import com.example.schedulefit.presentation.models.FitInfoPresentation
import javax.inject.Inject

class MapperFromEntityToPresentation @Inject constructor() :
        (FitInfoEntity) -> FitInfoPresentation {
    override fun invoke(fitInfoEntity: FitInfoEntity): FitInfoPresentation {
        return with(fitInfoEntity) {
            FitInfoPresentation(
                id = id,
                lessons = lessons.map { it.map() },
                option = option,
                tabs = tabs.map { it.map() },
                trainers = trainers.map { it.map() }
            )
        }
    }
}