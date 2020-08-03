/*
 * Created by KAPIL KUMAR
 * 03-08-2020
 * 05:33 PM
 **/
fun main(){
    var s="Happy Rakshabandhan"
    println(s)
    println(s.length)    //returns the length of String
    val c=s.get(6)       //Returns the character of the string at the given index.
    println("The Character at index 7 is $c")
    val subString=s.subSequence(6,19)          //Returns the subString which is start from StartIndex and end at EndIndex bit excluding the EndIndex Character
    println(subString)
}