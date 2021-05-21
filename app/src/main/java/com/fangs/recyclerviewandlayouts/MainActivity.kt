package com.fangs.recyclerviewandlayouts

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //numbers
        //region
        val rvNumbers = findViewById<RecyclerView>(R.id.rv_countingNumbers)
        //scaffold
        rvNumbers.layoutManager = GridLayoutManager(this, 5)
        rvNumbers.setHasFixedSize(true)
        rvNumbers.adapter = NumbersAdapter(this,10)
        //endregion

        //alphabets
        //region
        val rvAlphabet = findViewById<RecyclerView>(R.id.rv_alphabets)
        rvAlphabet.layoutManager = GridLayoutManager(this, 5)
        rvAlphabet.setHasFixedSize(true)
        rvAlphabet.adapter = AlphabetAdapter(this, 20)


        //endregion

        //roman numerals
        //region
        val rvRomanNumerals = findViewById<RecyclerView>(R.id.rv_roman_numerals)
        rvRomanNumerals.layoutManager = GridLayoutManager(this, 5)
        rvRomanNumerals.setHasFixedSize(true)
        rvRomanNumerals.adapter = RomanNumeralsAdapter(this, 10)

        //endregion





    }
}