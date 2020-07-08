package com.simpleapp.simplemvpapp.ui.base

abstract class BasePresenterFragment<P : BasePresenter<*>> : BaseFragment() {
    abstract val presenter: P

    override fun onStart() {
        super.onStart()
        presenter.subscribe()
    }

    override fun onStop() {
        super.onStop()
        presenter.unSubscribe()
    }
}