package com.simpleapp.simplemvpapp.ui.login

import android.os.Handler
import com.simpleapp.simplemvpapp.data.model.LoginResponse
import com.simpleapp.simplemvpapp.data.network.ApiClient
import com.simpleapp.simplemvpapp.ui.base.BasePresenter
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LoginPresenter(override val view: LoginContract.View) : BasePresenter<LoginContract.View>,
    LoginContract.Presenter {

    override fun doLogin(username: String, password: String) {
//        use below code for network calls
        view.showProgress()
        Handler().postDelayed({
            view.hideProgress()
            view.openMain()
        }, 2000)
    }

    /*override fun doLogin(username: String, password: String) {
        view.showProgress()
        ApiClient.instance.validateCredentialsApiCall(username, password)
            .enqueue(object : Callback<LoginResponse> {
                override fun onFailure(call: Call<LoginResponse>, t: Throwable) {
                    view.hideProgress()
                    view.showServerErrorResponse("")
                }

                override fun onResponse(call: Call<LoginResponse>,
                                        response: Response<LoginResponse>
                ) {
                    try {
                        if (response.body()!!.login){
                            view.openMain()
                        } else{
                            view.showServerErrorResponse(response.body()?.error?:"")
                        }
                    } catch (e: Exception){}
                    view.hideProgress()
                }
            })
    }*/
}