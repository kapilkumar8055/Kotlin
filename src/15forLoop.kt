/*
 * Created by KAPIL KUMAR
 * 04-08-2020
 * 11:52 PM
 **/
fun main() {
    for (i in 1..100) {
        print("$i  ")
    }
    println()


    //Traverse array using for Loop
    val array = arrayOf(1, 2, 3, 4, 5)
    for (i in 0..array.size - 1) {
        println(array[i])
    }


    //using until keyword
    for (i in 0 until array.size) {
        println(array[i])
    }


    //increment using step keyword
    for (i in 1..10 step 3) {
        print("$i  ")
    }
    println()

    //decrement using downTo keyword
    for (i in 10 downTo 1) {
        print("$i  ")
    }
    println()
}