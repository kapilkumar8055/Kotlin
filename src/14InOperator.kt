/*
 * Created by KAPIL KUMAR
 * 04-08-2020
 * 11:35 PM
 **/
fun main() {
    val num = 7
    when (num) {
        in 1..10 -> println("Number is between 1 to 10")                    //including 1 and 10 alse
        in 11..20 -> println("Number is between 11 to 20")
        else -> {
            println("None")
        }
    }
}