/*
 * Created by KAPIL KUMAR
 * 03-08-2020
 * 06:55 PM
 **/
import java.util.*

fun main() {
    var charArray = arrayOf('a', 'b', 'c', 'd', 'e', 'f')

    val charArray2 = arrayOf<Char>('a', 'b', 'c', 'd', 'e', 'f')

    val allTypeArray = arrayOf("kapil", 'k', 10, 10.56, 5.93f)

    var allTypeArray2 = arrayOf<Any>("kapil", 'k', 10, 10.56, 5.93f)

    println(charArray.get(0))        //Returns the Character present at the given index
    println(charArray.get(1))
    println(charArray.get(2))
    println(charArray.get(3))
    println(charArray.get(4))

    println(charArray[1])           //Returns the Character present at the given index
    charArray[1] = 'B'                //Chane the value of array at index 1
    println(charArray[1])

    println(Arrays.toString(charArray))         //print all array using toString() function
    println(Arrays.toString(charArray2))
    println(Arrays.toString(allTypeArray))
    println(Arrays.toString(allTypeArray2))

    println(allTypeArray.contentToString())     //We can also print entire array using contentToString() function

    println(allTypeArray2[0])
    allTypeArray2[0] = 100
    println(allTypeArray2[0])
}