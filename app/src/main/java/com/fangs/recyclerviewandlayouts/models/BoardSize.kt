package com.fangs.recyclerviewandlayouts.models

enum class BoardSize (val cardsNum : Int)
{
    FIVE(5),
    TEN(10),
    TWENTY(20);



    fun getWidth() : Int {

        return when(this) {
            FIVE -> 1
            TEN -> 2
            TWENTY -> 4
        }
    }

    fun getHeight() : Int {
        return cardsNum / getWidth()
    }
}