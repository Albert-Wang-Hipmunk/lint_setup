package com.example.autolintcheck

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        setColor()
    }

    private fun setColor() {
        val newColor = getColor(R.color.colorPrimary)
        tv_text.setTextColor(newColor)
    }
}
