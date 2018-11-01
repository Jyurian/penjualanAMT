package com.example.ferdi.penjualanamt.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import com.example.ferdi.penjualanamt.R
import kotlinx.android.synthetic.main.activity_product_detail.*

class ProductDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product_detail)

        val produkTitle = intent.getStringExtra("Title")
        productDetailTitle.text = produkTitle.toString()

        val produkImage = intent.getStringExtra("Image")
        var gambar : ImageView = findViewById<ImageView>(R.id.productDetailImage)

        val resourceId : Int = this.resources.getIdentifier(produkImage, "drawable", packageName)

        gambar.setImageResource(resourceId)
    }
}
