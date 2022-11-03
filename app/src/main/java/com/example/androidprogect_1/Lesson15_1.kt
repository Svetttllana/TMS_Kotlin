package com.example.androidprogect_1

class Lesson15_1 {
    companion object {

        @JvmStatic
        fun main(args: Array<String>) {
            val child:Child = Child()



            val parent2 = child as Parent2

//            if (parent2 is Parent2)
//                parent2.sleep()
//                parent2.walk()

if (parent2 is Child){
    parent2.sleep()
    parent2.walk()
}




//прост проверяем является ли


            if (child is Parent2){
                child.sleep()
                child.walk()

            }

            if (child is Child){
                child.sleep()
                child.walk()

            }

        }
    }
}

open class Parent2 {

    open fun walk() {
        print("Psrent is walking...")
    }

}





class Child : Parent2(){
    override fun walk(){
        print("Child is walking...")
    }

    fun sleep(){
        print("Child is sleeping")
    }
}