package com.example.ferdi.penjualanamt.controller

import android.os.Bundle
import android.app.Activity
import android.util.Log
import android.view.View
import com.example.ferdi.penjualanamt.R
import com.example.ferdi.penjualanamt.Services.AuthService
import kotlinx.android.synthetic.main.activity_register.*


class RegisterActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

    }

    fun createUserClicked(view: View) {
        Log.i("FUNCTION", "Create user function is called")
//        AuthService.registerUser(this, "reg@gmail.com", "reg123","Udin"){complete ->
//            if(complete) {
//
//            }
//        }
        AuthService.registerUser(this,"reg@g.com", "rege"){complete ->
            if(complete){

            }
        }
    }
 }