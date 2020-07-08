package com.simpleapp.simplemvpapp.di

import com.simpleapp.simplemvpapp.SimpleApp
import com.simpleapp.simplemvpapp.data.preference.SharedPrefManager
import com.simpleapp.simplemvpapp.ui.mainfragment.SimpleContract
import com.simpleapp.simplemvpapp.ui.mainfragment.SimplePresenter
import com.simpleapp.simplemvpapp.ui.login.LoginContract
import com.simpleapp.simplemvpapp.ui.login.LoginPresenter
import com.simpleapp.simplemvpapp.ui.main.MainContract
import com.simpleapp.simplemvpapp.ui.main.MainPresenter
import org.koin.dsl.module

val DataModule = module {
    single { SharedPrefManager(SimpleApp.get()) } // injecting preference
}

val PagesModule = module {
    // injecting views
    factory { (view: LoginContract.View) -> LoginPresenter(view) as LoginContract.Presenter }
    factory { (view: MainContract.View) -> MainPresenter(view) as MainContract.Presenter }
    factory { (view: SimpleContract.View) -> SimplePresenter(view) as SimpleContract.Presenter }
}

val AdapterModule = module {
//    factory { (activity: AppCompatActivity) -> SpinnerAdapter(activity) } //injection with parameter

//    single { DashAdapter() } // it will use single instance
//    factory { AssignmentAdapter() } // it will create new instance each time
}

val appModules = listOf(DataModule, PagesModule, AdapterModule)