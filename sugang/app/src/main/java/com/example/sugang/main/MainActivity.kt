package com.example.sugang.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.sugang.R
import com.example.sugang.culture.CultureContract

class MainActivity : AppCompatActivity() , MainContract.View {
    private lateinit var presenter : MainContract.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter()
        presenter.setView(this)
    }
}
