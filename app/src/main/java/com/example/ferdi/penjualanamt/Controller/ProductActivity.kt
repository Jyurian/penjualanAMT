package com.example.ferdi.penjualanamt.Controller

import android.content.Intent
import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.util.Log
import com.example.ferdi.penjualanamt.Adapters.ProductsAdapter
import com.example.ferdi.penjualanamt.Model.Product
import com.example.ferdi.penjualanamt.R
import com.example.ferdi.penjualanamt.Services.DataService
import com.example.ferdi.penjualanamt.Utilities.EXTRA_TIPE_MOBIL
import com.example.ferdi.penjualanamt.Utilities.MarginItemDecoration
import kotlinx.android.synthetic.main.activity_product.*
import kotlin.math.log

class ProductActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)



         val mobilType = intent.getStringExtra(EXTRA_TIPE_MOBIL)

        var spanCount = 2

        val orientation = resources.configuration.orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE){
            spanCount = 3
        }

        adapter = ProductsAdapter(this , DataService.getProducts(mobilType)){Product ->

            val detailProductIntent = Intent(this, ProductDetailActivity::class.java)
            detailProductIntent.putExtra("Title", Product.title)
            detailProductIntent.putExtra("Image", Product.image)
            detailProductIntent.putExtra("Price", Product.price )

            startActivity(detailProductIntent)
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.layoutManager = layoutManager
        productListView.adapter = adapter

    }
}
