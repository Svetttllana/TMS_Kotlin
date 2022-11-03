package com.example.androidprogect_1

private const val  ZERO_ONE_TWO = 0
fun outerFun() {                                           // это внешняя функция
    println(" I am outher fun")
}
class Lesson15 { // но если будет ошибка то перед классом добавить open

    val contry:String = "RB"
    var city = "Minsk"
    lateinit var  adress:String // поздняя инициализация. тип присваиваем т.к он должен знать шо мы присвоим со временем


}
    companion object {


        @JvmStatic
        fun main(args: Array<String>) {
            val kotlinClass = KotlinClass("Gosha", 19)
            val string = kotlinClass.getNameAndAge()
            print(string)


            val kotlinClass2 = KotlinClass("country", "sity", "adress")
            print("${kotlinClass2.city} ${kotlinClass2.country} ${kotlinClass2.adress}")

            val String = kotlinClass.getNameAndAge()
            val Lesson15 = Lesson15()
            // Lesson15.contry= " cant change"
            Lesson15.city = " Brest"
            Lesson15.adress = " Molodeznaya 9"
            println("${Lesson15.adress}")
            // внешнюю функцию можно вызвать тут без указания класса
            outerFun()
        }
    }

    fun emptyFun(): Unit{
        println("I am emoty fun")
    }

    fun returnBoolean():Boolean= true   // через =true мы возвращаем   типа как если бы через  return




// в котлине есть первичный конструктор. это скобочки после названия класса
// :Parent ьф указали что наследуемся
class KotlinClass(val name: String,var age:Int): Parent(), Behavior {
    private var country: String = ""
    private var city: String = ""
    private var adress: String = ""


    constructor() : this("", 1)
    constructor(country: String, city: String, adress: String) : this() {
        this.country = country
        this.city = city
        this.adress = adress


    }





 // после двоеточего указали шо возвращаем
    fun getNameAndAge():String{

        return "$name + $age"
    }
// тут мы переопределили метод
    override fun getHeirColor() {
        super.getHeirColor()
    }

    override fun getEyeColor() {
        TODO("Not yet implemented")
    }
}

open class Parent{

   open fun getHeirColor(){   }
}

interface  Behavior{
   fun getEyeColor(){}
}

