package com.example.sugang.main

import com.example.sugang.main.MainContract

class MainPresenter : MainContract.Presenter{
    private lateinit var view : MainContract.View
    override fun setView(view : MainContract.View){
        this.view = view

    }

    override fun initNavigationBar() {

    }
}