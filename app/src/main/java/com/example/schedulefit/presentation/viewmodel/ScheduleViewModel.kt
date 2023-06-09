package com.example.schedulefit.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.map
import androidx.lifecycle.viewModelScope
import com.example.schedulefit.data.repository.FitRepository
import com.example.schedulefit.model.room.entities.FitInfoEntity
import com.example.schedulefit.network.Resource
import com.example.schedulefit.presentation.ListPresentationModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.HttpException
import javax.inject.Inject
import javax.net.ssl.SSLHandshakeException

class ScheduleViewModel @Inject constructor(
    private val repository: FitRepository
) : ViewModel() {

    val allFitnessInfo: LiveData<ListPresentationModel> = repository.fitLessonsInfo.map {

    }

    private val _state = MutableLiveData<Resource<FitInfoEntity>>()
    val state: LiveData<Resource<FitInfoEntity>> = _state

    fun getFitInfo() =
        viewModelScope.launch(Dispatchers.IO) {
            _state.postValue(Resource.Loading())
            repository.getFitLessonInfo().fold(
                onSuccess = { data -> _state.postValue((Resource.Success(data))) },
                onFailure = { error ->
                    when (error) {
                        is SSLHandshakeException ->
                            _state.postValue((Resource.Error("SSLHandshakeException")))

                        is HttpException ->
                            _state.postValue((Resource.Error("HttpException")))

                        else ->
                            _state.postValue((Resource.Error("Unknown Error")))
                    }
                }
            )
        }
}