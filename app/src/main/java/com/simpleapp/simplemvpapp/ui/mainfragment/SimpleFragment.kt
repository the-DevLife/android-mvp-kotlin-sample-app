package com.simpleapp.simplemvpapp.ui.mainfragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.simpleapp.simplemvpapp.R
import com.simpleapp.simplemvpapp.ui.base.BasePresenterFragment
import org.koin.android.ext.android.inject
import org.koin.core.parameter.parametersOf

class SimpleFragment : BasePresenterFragment<SimpleContract.Presenter>(),
    SimpleContract.View {

    override val presenter: SimpleContract.Presenter by inject { parametersOf(this) }

    companion object {
        @JvmStatic
        fun newInstance() = SimpleFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_simple, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUp()
    }

    override fun setUp() {

    }
}