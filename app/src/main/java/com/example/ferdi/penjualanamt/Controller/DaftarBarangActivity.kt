package com.example.ferdi.penjualanamt.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.ferdi.penjualanamt.MainAdapter
import com.example.ferdi.penjualanamt.R
import kotlinx.android.synthetic.main.activity_daftar_barang.*

class DaftarBarangActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_barang)

        barangRV.layoutManager = LinearLayoutManager(this)
        barangRV.adapter = MainAdapter()
    }
}
