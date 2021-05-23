package com.fangs.recyclerviewandlayouts
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.min

class AlphabetAdapter(private val context: Context, private val alphabetsLength: Int) :
    RecyclerView.Adapter<AlphabetAdapter.ViewHolder>() {

    companion object {
        private const val CARD_MARGIN = 20
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val cardWidth = parent.width / 5 - (2 * CARD_MARGIN)
        val cardHeight = parent.height / 4 - (2 * CARD_MARGIN)
        val cardSideLength = min(cardWidth, cardHeight)

        val view = LayoutInflater.from(context).inflate(R.layout.alphabet_card, parent, false)
        val layoutParams = view.findViewById<CardView>(R.id.cv_alphabet).layoutParams as ViewGroup.MarginLayoutParams
        layoutParams.width = cardSideLength
        layoutParams.height = cardSideLength
        layoutParams.setMargins(CARD_MARGIN,0,CARD_MARGIN,0)

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
