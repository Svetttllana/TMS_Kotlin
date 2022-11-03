package com.example.androidprogect_1

class Kollection {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //unmutable collection
            val collectionList = listOf<String>(
                "hello",
                "bue",
                "world"
            )

            // collectionList.add() we cant do so, but we can with constructor


            //mutable collection
//            val collectionList2 = mutableListOf<String>()
//            collectionList2.add("hello")
//            collectionList2.add("bue")
//            collectionList2.add("world")
//
//            collectionList.forEach{words ->                    // лучше указывать что мы выводим
//                println("$words")
//            }
//
//            for (i in 1 .. 10 ){
//                println(i)
//            }
//
//            val arrayList = arrayListOf<String>(
//                "hello",
//                "bue",
//                "world"
//            )
//            for (world in arrayList){
//                println(world)
//            }
//
//
//            for (i in 10 downTo  1 step 2) {
//                print("$i")
//
//            }


            for (i in 1..10) {
                if (i == 2) {
                    println("hello world")
                    continue

                }
                println(i)
            }


            val typesClass = Kollection()
            repeat(10){
                println(typesClass.getName())
            }
        }
    }

    fun getName():String{
        return "Hello!!!!!!!!!"
    }
}