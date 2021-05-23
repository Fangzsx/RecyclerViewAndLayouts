package com.fangs.recyclerviewandlayouts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.min

class NumbersAdapter(private val context: Context, private val numbers : Int) :
    RecyclerView.Adapter<NumbersAdapter.ViewHolder>() {

    companion object {
        private const val CARD_MARGIN = 20
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val cardHeight = parent.height / 2 - (2 * CARD_MARGIN)
        val cardWidth = parent.width / 5 - (2 * CARD_MARGIN)
        val cardSideLength = min(cardHeight, cardWidth)

        val view = LayoutInflater.from(context).inflate(R.layout.number_card, parent, false)
        val layoutParams = view.findViewById<CardView>(R.id.cv_numbers).layoutParams as ViewGroup.MarginLayoutParams
        layoutParams.width = cardSideLength
        layoutParams.height = cardSideLength
        layoutParams.setMargins(CARD_MARGIN,CARD_MARGIN,CARD_MARGIN,CARD_MARGIN)
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
