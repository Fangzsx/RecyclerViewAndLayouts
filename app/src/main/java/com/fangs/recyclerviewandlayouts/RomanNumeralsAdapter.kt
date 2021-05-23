package com.fangs.recyclerviewandlayouts

import android.content.Context
import android.os.Debug
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.min

class RomanNumeralsAdapter(private val context: Context, private val number: Int) :
    RecyclerView.Adapter<RomanNumeralsAdapter.ViewHolder>() {

    companion object {
        private val hashMap : HashMap<String, String> = HashMap<String, String>()
        private const val CARD_MARGIN = 20

    }




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        hashMap["1"] = "I"
        hashMap["2"] = "II"
        hashMap["3"] = "III"
        hashMap["4"] = "IV"
        hashMap["5"] = "V"
        hashMap["6"] = "VI"
        hashMap["7"] = "VII"
        hashMap["8"] = "VIII"
        hashMap["9"] = "IX"
        hashMap["10"] = "X"

        Log.d("parent height", "${parent.height}")
        val cardWidth = parent.width / 5 - (2 * CARD_MARGIN) //no of cards horizontally = 5
        val cardHeight = parent.height / 2 - (2 * CARD_MARGIN)//no of cards vertically = 2
        val cardSideLength = min(cardWidth, cardHeight)

        val view = LayoutInflater.from(context).inflate(R.layout.roman_numeral, parent,false)
        val layoutParams = view.findViewById<CardView>(R.id.cv_roman_numerals).layoutParams as ViewGroup.MarginLayoutParams
        layoutParams.width = cardSideLength
        layoutParams.height = cardSideLength
        layoutParams.setMargins(CARD_MARGIN, CARD_MARGIN, CARD_MARGIN, CARD_MARGIN)


        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val textRoman = holder.itemView.findViewById<TextView>(R.id.tv_roman_number)
        if(hashMap.containsKey((position+1).toString())){
            textRoman.text = hashMap[(position+1).toString()]
        }
    }

    override fun getItemCount(): Int = number

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

    }

}
