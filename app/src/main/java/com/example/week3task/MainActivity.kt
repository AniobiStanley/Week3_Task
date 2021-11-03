package com.example.week3task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate
import android.R
import android.view.View


class MainActivity : AppCompatActivity() {

    lateinit var switch : Switch

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()



        val switch = findViewById<Switch>(R.id.mode_switch) as Switch
        switch.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // The toggle is enabled
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            } else {
                // The toggle is disabled
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
    }
}