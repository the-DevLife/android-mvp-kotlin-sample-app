package com.simpleapp.simplemvpapp.ui.main

import android.os.Bundle
import com.simpleapp.simplemvpapp.R
import com.simpleapp.simplemvpapp.ui.base.BasePresenterActivity
import com.simpleapp.simplemvpapp.ui.mainfragment.SimpleFragment
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class MainActivity : BasePresenterActivity<MainContract.Presenter>(), MainContract.View {

    override val presenter: MainContract.Presenter by inject { parametersOf(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setUp()
    }

    override fun setUp() {
        val fm = supportFragmentManager
        fm.beginTransaction()
            .add(R.id.main_container, SimpleFragment.newInstance())
            .addToBackStack(null)
            .commit()
    }

    override fun showProgress() {

    }

    override fun hideProgress() {
    }

    override fun onBackPressed() {
        val fm = supportFragmentManager
        val count = fm.backStackEntryCount
        if (count == 1){
            finish()
        }
        super.onBackPressed()

    }
}