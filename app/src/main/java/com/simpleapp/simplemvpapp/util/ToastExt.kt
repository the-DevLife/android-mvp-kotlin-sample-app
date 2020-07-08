package com.simpleapp.simplemvpapp.util

import android.view.View
import android.widget.Toast

fun View.showToast(messageRes: String){
    Toast.makeText(context, messageRes, Toast.LENGTH_SHORT).show()
}
