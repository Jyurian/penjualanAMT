package com.example.ferdi.penjualanamt.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.example.ferdi.penjualanamt.R
import kotlinx.android.synthetic.main.activity_main.*


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
        val i = Intent(this, HomeActivity::class.java)
        startActivity(i)
    }


}
