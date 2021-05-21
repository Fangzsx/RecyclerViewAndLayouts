package com.fangs.recyclerviewandlayouts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class AlphabetAdapter(private val context: Context, private val alphabetsLength: Int) :
    RecyclerView.Adapter<AlphabetAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        LayoutInflater.from(context).inflate(R.layout.alphabet_card, parent, false)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = alphabetsLength

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

}
