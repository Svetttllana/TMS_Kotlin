package com.example.androidprogect_1.Kotlin

class Less16 {

   // val number: Int = null
    //val name: String? = null


    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
       val values = Value(0)

       print(values.name)

        }
    }
}


data class Value(


    val number:Int,
    //дата класс можт содерж в себе уже инициал переменные
val name: String? = "have not string"
    )