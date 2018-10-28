package com.example.ferdi.penjualanamt.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.ferdi.penjualanamt.Model.TipeMobil
import com.example.ferdi.penjualanamt.R

class MobilRecycleAdapter(val context : Context, val mobil : List<TipeMobil>, val itemClick: (TipeMobil) -> Unit): RecyclerView.Adapter<MobilRecycleAdapter.Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MobilRecycleAdapter.Holder {
    val view = LayoutInflater.from(context)
            .inflate(R.layout.mobil_list_item, parent, false)
        return Holder(view , itemClick)
    }

    override fun getItemCount(): Int {
        return mobil.count()
    }

    override fun onBindViewHolder(holder: MobilRecycleAdapter.Holder, position: Int) {
        holder?.bindMobil(mobil[position], context)
    }

    inner class Holder(itemView: View, val itemClick: (TipeMobil) -> Unit) : RecyclerView.ViewHolder(itemView){

        val mobilImage = itemView?.findViewById<ImageView>(R.id.mobilImage)
        val mobilName = itemView?.findViewById<TextView>(R.id.mobilTxt)

        fun bindMobil(mobil : TipeMobil, context: Context){
            val resourceId = context.resources.getIdentifier(mobil.image,
                                "drawable", context.packageName)
            mobilImage?.setImageResource(resourceId)
            mobilName?.text = mobil.title
            itemView.setOnClickListener{ itemClick(mobil)}
        }

    }
}