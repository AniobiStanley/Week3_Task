package com.example.week3task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CompoundButton
import androidx.appcompat.app.AppCompatDelegate
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.SwitchCompat


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide() //Hide action bar


        var switch = findViewById<SwitchCompat>(R.id.light_dark_mode) //Initialize switch for dark/light mode switching

        //setting onClickListener for the switch and action.
        switch.setOnClickListener {
            if (switch.isChecked) {
                // The toggle is enabled
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                switch.text="Set a mode"
            } else {
                // The toggle is disabled
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }
    }
}