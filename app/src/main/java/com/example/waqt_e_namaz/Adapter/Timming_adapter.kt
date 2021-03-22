package com.example.waqt_e_namaz.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.waqt_e_namaz.Model.Timming
import com.example.waqt_e_namaz.R


class Timming_adapter(private val namaz_timming:MutableList<Timming>):RecyclerView.Adapter<Timming_adapter.MyViewHolder>() {
    class MyViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {

        var namaz_timming:TextView

        init {
            namaz_timming=itemView.findViewById(R.id.namaz_timming)
        }


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var itemView= LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.namaz_timming.text=namaz_timming[position].name
    }

    override fun getItemCount(): Int {
        return namaz_timming.size
    }
}