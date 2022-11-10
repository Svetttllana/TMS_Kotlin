package com.example.androidprogect_1.Kotlin

class Proverka_NaNULL {

val nullable:Int? = null
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {


            val Proverka_NaNULL = Proverka_NaNULL
            var nonNullableValue:Int =0 // не налл переменная

            val nullableValue:Int? = null// это налл переменная

//            if (nullableValue!=null) {//  проверяю что не нал наша нал переменная она будет присваиватся без вопросса
//                nonNullableValue = nullableValue
//            }else{ // а вот эта с вопросом, т.к она в елс ветке
//                nonNullableValue = nullableValue


            // let  это проверка на null
            // это был второй способ проверки на налл
//            nullableValue?.let {
//                nonNullableValue = it
//            }
//            if(nullableValue !=null){
//                nonNullableValue = nullableValue

//nonNullableValue = nullableValue?: 10   // это элвис опрератор. он выведет любое значение которое мы ожидаем
//
//            println(nonNullableValue)


         //   }


                // оператор non null
            var nonNullableValue1:Int =10
            val nullableValue1:Int? = null
            nonNullableValue =nullableValue!!
            println(nonNullableValue)



            // способ 5
            val outer = Outer(Inner("value us inner"))
            val value: String = outer.inner?.Value?:" "
        }
    }
}


data class Outer(val inner: Inner?)
data class Inner(val Value: String)

