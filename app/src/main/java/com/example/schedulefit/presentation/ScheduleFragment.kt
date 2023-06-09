package com.example.schedulefit.presentation

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.fitnessshedule.R
import com.example.fitnessshedule.databinding.FragmentScheduleBinding
import com.example.schedulefit.FitApplication
import com.example.schedulefit.presentation.adapter.FitnessListAdapter
import com.example.schedulefit.presentation.models.LessonPresentation
import com.example.schedulefit.presentation.viewmodel.ScheduleViewModel

class ScheduleFragment : BaseFragment(R.layout.fragment_schedule) {

    private val viewModel: ScheduleViewModel by viewModels { viewModelFactory }

    private val binding by viewBinding(FragmentScheduleBinding::bind)

    override fun onAttach(context: Context) {
        (context.applicationContext as FitApplication).appComponent.inject(this)
        super.onAttach(context)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val fitAdapter = FitnessListAdapter()
        binding.recyclerView.adapter = fitAdapter

        binding.recyclerView.layoutManager = LinearLayoutManager(view.context)

        viewModel.allFitnessInfo.observe(viewLifecycleOwner) { allInfo ->
            allInfo.let { fitAdapter.submitList(it) }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_schedule, container, false)
    }

    private fun bindInformation(model: LessonPresentation) {
        with(binding) {

        }
    }

}