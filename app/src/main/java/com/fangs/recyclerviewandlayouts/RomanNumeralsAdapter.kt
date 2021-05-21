package com.fangs.recyclerviewandlayouts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RomanNumeralsAdapter(private val context: Context, private val number: Int) :
    RecyclerView.Adapter<RomanNumeralsAdapter.ViewHolder>() {

    private val hashMap : HashMap<String, String> = HashMap<String, String>()



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

        val view = LayoutInflater.from(context).inflate(R.layout.roman_numeral, parent,false)
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
