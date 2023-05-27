package com.example.schedulefit.presentation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fitnessshedule.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager
                .beginTransaction()
                .add(R.id.fragment_container_view_tag, ScheduleFragment())
                .commit()
        }
    }

}