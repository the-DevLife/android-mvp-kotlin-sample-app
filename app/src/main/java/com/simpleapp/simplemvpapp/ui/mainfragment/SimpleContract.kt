package com.simpleapp.simplemvpapp.ui.mainfragment

import com.simpleapp.simplemvpapp.ui.base.BasePresenter
import com.simpleapp.simplemvpapp.ui.base.BaseView

interface SimpleContract {
    interface View : BaseView {
    }

    interface Presenter : BasePresenter<View> {
    }
}