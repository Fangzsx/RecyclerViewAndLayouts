package com.fangs.recyclerviewandlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rvNumbers = findViewById<RecyclerView>(R.id.rv_countingNumbers)
        //scaffold
        rvNumbers.layoutManager = GridLayoutManager(this, 5)
        rvNumbers.setHasFixedSize(true)
        rvNumbers.adapter = NumbersAdapter(this,10)






    }
}