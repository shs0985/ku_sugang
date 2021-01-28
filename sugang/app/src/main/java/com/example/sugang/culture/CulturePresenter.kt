package com.example.sugang.culture

import androidx.fragment.app.Fragment

class CulturePresenter : CultureContract.Presenter{
    private lateinit var view : CultureContract.View
    override fun setView(view: CultureContract.View) {
        this.view = view
    }
}