package com.example.amitrai.kotlindemo.utility

import android.support.constraint.ConstraintLayout
import android.support.design.widget.Snackbar

/**
 * Created by amitrai on 27/7/17.
 */

/**
 * shows Snackbar
 */
fun showSnackBar(layout: ConstraintLayout, message: String) {
    try {
        Snackbar.make(layout, "" + message, Snackbar.LENGTH_LONG).show()
    }catch (exp: Exception){
        exp.printStackTrace()
    }
}