package com.fangs.recyclerviewandlayouts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.fangs.recyclerviewandlayouts.models.BoardSize

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //numbers
        //region
        val rvNumbers = findViewById<RecyclerView>(R.id.rv_countingNumbers)
        //scaffold
        rvNumbers.layoutManager = GridLayoutManager(this, 5)
        rvNumbers.adapter = NumbersAdapter(this,BoardSize.TEN)
        rvNumbers.setHasFixedSize(true)
        //endregion

        //alphabets
        //region
        val rvAlphabet = findViewById<RecyclerView>(R.id.rv_alphabets)
        rvAlphabet.layoutManager = GridLayoutManager(this, 5)
        rvAlphabet.adapter = AlphabetAdapter(this, BoardSize.TWENTY)
        rvAlphabet.setHasFixedSize(true)


        //endregion

        //roman numerals
        //region
        val rvRomanNumerals = findViewById<RecyclerView>(R.id.rv_roman_numerals)
        rvRomanNumerals.layoutManager = GridLayoutManager(this, 5)
        rvRomanNumerals.adapter = RomanNumeralsAdapter(this, BoardSize.TEN)
        rvRomanNumerals.setHasFixedSize(true)

        //endregion





    }
}