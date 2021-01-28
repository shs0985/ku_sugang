package com.example.sugang.culture

interface CultureContract {
    interface View{

    }
    interface Presenter{
        fun setView(view: View)
    }
}