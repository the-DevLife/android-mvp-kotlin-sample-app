package com.simpleapp.simplemvpapp.ui.main

import com.simpleapp.simplemvpapp.ui.base.BasePresenter
import org.koin.core.KoinComponent


class MainPresenter(override val view: MainContract.View) : BasePresenter<MainContract.View>
    , MainContract.Presenter, KoinComponent {

//    private val sharedPrefManager : SharedPrefManager by inject()

    override fun checkLogin() {
    }
}