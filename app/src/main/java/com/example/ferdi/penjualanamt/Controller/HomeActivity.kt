package com.example.ferdi.penjualanamt.Controller

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.widget.ArrayAdapter
import com.example.ferdi.penjualanamt.Adapters.MobilAdapter
import com.example.ferdi.penjualanamt.Adapters.MobilRecycleAdapter
import com.example.ferdi.penjualanamt.R
import com.example.ferdi.penjualanamt.Services.DataService
import com.example.ferdi.penjualanamt.Model.TipeMobil
import com.example.ferdi.penjualanamt.Utilities.EXTRA_TIPE_MOBIL
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity()  {

//    private val mDrawerLayout?: DrawerLayout
//    private val mToggle? : ActionBarDrawerToggle

    lateinit var adapter: MobilRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
//
//        mToggle = ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close)
//
//        mDrawerLayout.addDrawerListener(mToggle)
//        mToggle.syncState()
//
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true)

        adapter = MobilRecycleAdapter(this, DataService.Mobil){tipeMobil ->

            val productIntent = Intent(this,ProductActivity::class.java )
            productIntent.putExtra(EXTRA_TIPE_MOBIL, tipeMobil.title)
            startActivity(productIntent)
        }
        MobilListView.adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        MobilListView.layoutManager = layoutManager
        MobilListView.setHasFixedSize(true)

    }

}
