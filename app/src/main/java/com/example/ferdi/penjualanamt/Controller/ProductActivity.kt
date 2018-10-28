package com.example.ferdi.penjualanamt.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.ferdi.penjualanamt.R
import com.example.ferdi.penjualanamt.Utilities.EXTRA_TIPE_MOBIL
import kotlin.math.log

class ProductActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

         val a = intent.getStringExtra(EXTRA_TIPE_MOBIL)
        println(a)
        Log.d("Intent",a )
    }
}
