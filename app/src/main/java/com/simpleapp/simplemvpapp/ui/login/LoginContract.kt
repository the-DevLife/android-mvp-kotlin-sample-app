package com.simpleapp.simplemvpapp.ui.login

import com.simpleapp.simplemvpapp.ui.base.BasePresenter
import com.simpleapp.simplemvpapp.ui.base.BaseView

interface LoginContract {

    interface View : BaseView {
        fun showProgress()
        fun hideProgress()

        fun showServerErrorResponse(message: String)
        fun openMain()
    }

    interface Presenter : BasePresenter<View> {
        fun doLogin(username: String, password: String)
    }

}