package com.example.schedulefit.presentation

import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import com.example.schedulefit.presentation.viewmodel.ViewModelFactory
import javax.inject.Inject

abstract class BaseFragment(@LayoutRes contentLayoutId: Int = 0) : Fragment(contentLayoutId) {

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

}