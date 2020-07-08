package com.simpleapp.simplemvpapp.ui.base

import androidx.fragment.app.DialogFragment

abstract class BaseDialogFragment<P : BasePresenter<*>> : DialogFragment() {
    abstract val presenter: P

    override fun onStart() {
        super.onStart()
        presenter.subscribe()
    }

    override fun onStop() {
        super.onStop()
        presenter.unSubscribe()
    }

    protected abstract fun setUp()
}