package com.github.kornilovmikhail.mvpandroidproject.ui

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import com.github.kornilovmikhail.mvpandroidproject.R

class MainActivity : AppCompatActivity(), MainViewInterface {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
