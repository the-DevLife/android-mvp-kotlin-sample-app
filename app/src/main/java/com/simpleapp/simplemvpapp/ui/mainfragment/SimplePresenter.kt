package com.simpleapp.simplemvpapp.ui.mainfragment

import com.simpleapp.simplemvpapp.ui.base.BasePresenter

class SimplePresenter(override val view: SimpleContract.View) :
    BasePresenter<SimpleContract.View>, SimpleContract.Presenter {
}