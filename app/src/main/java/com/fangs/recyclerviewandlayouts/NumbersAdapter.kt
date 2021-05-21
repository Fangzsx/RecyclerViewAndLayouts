package com.fangs.recyclerviewandlayouts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class NumbersAdapter(private val context: Context, private val numbers : Int) :
    RecyclerView.Adapter<NumbersAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(context).inflate(R.layout.number_card, parent, false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val numText: TextView = holder.itemView.findViewById<TextView>(R.id.tv_card_num)
        numText.text = "${position + 1}"


    }

    override fun getItemCount(): Int = numbers

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){


    }

}
