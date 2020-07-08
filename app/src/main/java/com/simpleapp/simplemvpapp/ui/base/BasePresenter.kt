package com.simpleapp.simplemvpapp.ui.base


interface BasePresenter<V : BaseView> {
    val view: V
    fun subscribe(){}
    fun unSubscribe(){}
}