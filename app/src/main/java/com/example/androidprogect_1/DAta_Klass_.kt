package com.example.androidprogect_1

class DAta_Klass_ {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            val country1 = Country("Minsk ","Molodeznaya 9 ")
            val country2 = Country2("Brest ","Lenina ")

            println(country1)
            println(country2)
        }
    }
}




// create Data class

data class Country(val city:String, val adress:String)
class Country2(val city:String, val adress:String)
