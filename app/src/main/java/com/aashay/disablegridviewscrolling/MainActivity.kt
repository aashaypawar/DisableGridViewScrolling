package com.aashay.disablegridviewscrolling

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.view.ViewGroup
import android.widget.*

class MainActivity : AppCompatActivity() {

    @SuppressLint("ClickableViewAccessibility")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gridView = findViewById<GridView>(R.id.gridLayout)
        gridView.numColumns = 1
        gridView.adapter = MyGridViewAdapter(this)


        gridView.setOnTouchListener { _, event ->
            Toast.makeText(applicationContext, "Scrolling is Disabled", Toast.LENGTH_SHORT).show()
            event.action == MotionEvent.ACTION_MOVE
        }


    }
}