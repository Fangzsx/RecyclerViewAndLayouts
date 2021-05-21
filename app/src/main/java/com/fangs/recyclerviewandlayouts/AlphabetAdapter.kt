package com.fangs.recyclerviewandlayouts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AlphabetAdapter(private val context: Context, private val alphabetsLength: Int) :
    RecyclerView.Adapter<AlphabetAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.alphabet_card, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val letter = holder.itemView.findViewById<TextView>(R.id.tv_letter)
        letter.text = ((position + 65).toChar()).toString()

    }

    override fun getItemCount(): Int = alphabetsLength

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

}
