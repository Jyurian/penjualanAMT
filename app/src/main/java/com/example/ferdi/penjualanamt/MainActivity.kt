package com.example.ferdi.penjualanamt

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.ferdi.penjualanamt.R.layout.activity_register
import com.example.ferdi.penjualanamt.R.layout.activity_home


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun registerClicked(v : View){
        val i = Intent(this, register::class.java )
        startActivity(i)
    }

    fun loginClicked(v: View){
        val i = Intent(this, drawer_navi::class.java)
        startActivity(i)
    }
}
