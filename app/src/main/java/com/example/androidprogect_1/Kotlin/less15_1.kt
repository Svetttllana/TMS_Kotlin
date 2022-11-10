package com.example.androidprogect_1.Kotlin

class less15_1 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val first = First1().navigate()
            // без скобочек, ему не над экземпл класса. он как статический
            val second = First1.walk()


        }
    }
}


class First1 {

    fun navigate() {


        println("navigate")
    }


    companion object {
        fun walk() {
            print("I am walking")


        }
    }
}