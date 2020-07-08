package com.simpleapp.simplemvpapp.ui.main

import com.simpleapp.simplemvpapp.ui.base.BasePresenter
import com.simpleapp.simplemvpapp.ui.base.BaseView

interface MainContract {
    interface View : BaseView {
        fun showProgress()
        fun hideProgress()
    }

    interface Presenter : BasePresenter<View> {
        fun checkLogin()
    }
}