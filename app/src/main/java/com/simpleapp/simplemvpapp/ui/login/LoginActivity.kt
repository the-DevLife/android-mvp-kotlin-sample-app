package com.simpleapp.simplemvpapp.ui.login

import android.os.Bundle
import com.simpleapp.simplemvpapp.R
import com.simpleapp.simplemvpapp.data.preference.SharedPrefManager
import com.simpleapp.simplemvpapp.ui.base.BasePresenterActivity
import com.simpleapp.simplemvpapp.util.ActivityMediator
import com.simpleapp.simplemvpapp.util.hide
import com.simpleapp.simplemvpapp.util.show
import com.simpleapp.simplemvpapp.util.showToast
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.view_progress_bar.*
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class LoginActivity : BasePresenterActivity<LoginContract.Presenter>(), LoginContract.View {

    override val presenter: LoginContract.Presenter by inject { parametersOf(this) }
    private val preference: SharedPrefManager by inject()

    override fun onStart() {
        super.onStart()
        if (preference.getLoginStatus()){
            ActivityMediator.startMainActivity(this)
            finish()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        setUp()
    }

    override fun setUp() {
        login_btn?.setOnClickListener {
            when {
                et_username?.text.toString() == "" -> tf_username.error = getString(R.string.error_username)
                et_password?.text.toString() == "" -> tf_password.error = getString(R.string.error_password)
                else -> presenter.doLogin(et_username?.text.toString(), et_password?.text.toString())
            }
        }
    }

    override fun openMain() {
        ActivityMediator.startMainActivity(this)
    }

    override fun showServerErrorResponse(message: String) {
        et_username?.showToast(message)
    }

    override fun showProgress() {
        progress_bar?.show()
    }

    override fun hideProgress() {
        progress_bar?.hide()
    }
}