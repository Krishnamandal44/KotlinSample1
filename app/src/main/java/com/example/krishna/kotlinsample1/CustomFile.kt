package com.example.krishna.kotlinsample1

import android.content.Context
import android.widget.Toast

fun showMyProfileDta() :String{
    var name ="Krishna Mandal"
    var email ="krishnamandal44@gmail.com"
    var mobile ="9749408134"
    var address ="Kolkata,Picnic garden,700039"
    return email

}

fun Context.toast(message: CharSequence) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

