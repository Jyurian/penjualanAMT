package com.example.ferdi.penjualanamt

import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.barang_row.view.*

class MainAdapter: RecyclerView.Adapter<CustomViewHolder>() {

    val namaBarang = listOf("1" , "2", "3", "2", "3", "2", "3", "2", "3", "2", "3", "2", "3")
    override fun getItemCount(): Int {
        return namaBarang.size
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolder {
        val layoutInflater = LayoutInflater.from(p0?.context)
        val cellForRow = layoutInflater.inflate(R.layout.barang_row, p0, false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(p0: CustomViewHolder, p1: Int) {
        val namaBarang = namaBarang.get(p1)
        p0?.view?.namaBarangET?.text = namaBarang
    }
}

class CustomViewHolder(val view: View) : RecyclerView.ViewHolder(view){

}