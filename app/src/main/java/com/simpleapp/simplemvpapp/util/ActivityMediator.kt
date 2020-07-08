package com.simpleapp.simplemvpapp.util

import android.content.Context
import android.content.Intent
import com.simpleapp.simplemvpapp.ui.login.LoginActivity
import com.simpleapp.simplemvpapp.ui.main.MainActivity

object ActivityMediator {
    fun startMainActivity(context: Context){
        context.startActivity(Intent(context, MainActivity::class.java))
    }

    fun startLoginActivity(context: Context){
        context.startActivity(Intent(context, LoginActivity::class.java))
    }
}