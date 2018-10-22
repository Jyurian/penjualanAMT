package com.example.ferdi.penjualanamt.controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.ferdi.penjualanamt.R
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONObject


class MainActivity : AppCompatActivity() {

    val homeUrl = "http://localhost/data_amt/showCustomer.php"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//
//        val jsonObj = JSONObject()
//
//        loginBtn.setOnClickListener{
//            jsonObj.put("email",emailLoginET)
//            jsonObj.put("password", pwdLoginET)
//            val que = Volley.newRequestQueue(this@MainActivity)
//            val req = JsonObjectRequest(Request.Method.GET, homeUrl,null,
//                    Response.Listener {
//                        response ->
//                        Log.d("login","Login Success")
//
//                    }, Response.ErrorListener {
//                error ->
//                Log.d("login","Login failed")
//            })
//        }
    }

    fun registerClicked(v : View){
        val i = Intent(this, RegisterActivity::class.java )
        startActivity(i)
    }

    fun loginClicked(v: View){

        var username : String = emailLoginET.text.toString()
        var password : String = pwdLoginET.text.toString()
        val i = Intent(this, DaftarBarangActivity::class.java)
        startActivity(i)
    }


}
