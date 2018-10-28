package com.example.ferdi.penjualanamt.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.ferdi.penjualanamt.Model.TipeMobil
import com.example.ferdi.penjualanamt.R

class MobilAdapter(context : Context, mobil : List<TipeMobil>): BaseAdapter() {

    val context = context
    val mobil  = mobil

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val mobilView : View
        val holder: ViewHolder

        if(convertView == null){
            mobilView = LayoutInflater.from(context).inflate(R.layout.mobil_list_item, null)
            holder = ViewHolder()

           holder.mobilImage  = mobilView.findViewById(R.id.mobilImage)
            holder.mobilName  = mobilView.findViewById(R.id.mobilTxt)

            mobilView.tag = holder
        }   else{
            holder = convertView.tag as ViewHolder
            mobilView = convertView
        }

        val mobilp = mobil[position]

        val resourceId = context.resources.getIdentifier(mobilp.image, "drawable", context.packageName)
        holder.mobilImage?.setImageResource(resourceId)
        println(resourceId)
        holder.mobilName?.text = mobilp.title

        return  mobilView
    }


    override fun getItem(position: Int): Any {
        return mobil[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return mobil.count()
    }

    private class ViewHolder {
        var mobilName : TextView? = null
        var mobilImage : ImageView? = null
    }

}