package com.example.androidprogect_1

class SealdClassEX {
    lateinit var wallet: Wallet
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
          val dataKlass = SealdClassEX()

          repeat(10){
              val random = (1 ..2).random()

              if (random==2){
                  dataKlass.wallet =Wallet.Dollar(10, 1)
              }else{
                  dataKlass.wallet=Wallet.Euro(20,2)
              }

              when(dataKlass.wallet){
                  is Wallet.Dollar ->{
                      println((dataKlass.wallet as Wallet.Dollar).buy.toString() + " Dollar")


                  }
                  is  Wallet.Euro ->{
                      println((dataKlass.wallet as Wallet.Euro).buy.toString() + " Euro")

                  }
              }
          }
        }
    }
}

sealed class Wallet{




    data class Euro(val buy:Int, val sell:Int):Wallet()

    data class Dollar(val buy:Int, val sell:Int):Wallet()

}