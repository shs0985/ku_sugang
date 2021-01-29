package com.example.sugang.main

interface MainContract {
    interface View {

    }
    interface Presenter{
        fun setView(view: View)
        fun initNavigationBar()
    }
}