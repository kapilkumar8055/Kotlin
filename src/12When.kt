/*
 * Created by KAPIL KUMAR
 * 04-08-2020
 * 11:14 PM
 **/
fun main() {
    when (5) {
        0 -> println("Zero")
        1 -> println("One")
        2 -> println("Two")
        3 -> println("Three")
        4 -> println("Four")
        5 -> println("Five")
        else -> println("None of the above")
    }

    //number is positive or negative
    val num=10
    when{
        num<0 -> println("Negative")
        num>0 -> println("Positive")
        else -> println("Zero")
    }
}