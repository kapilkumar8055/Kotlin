/*
 * Created by KAPIL KUMAR
 * 04-08-2020
 * 10:53 PM
 **/
fun main(){
    val num1=20
    var num2=0

    if(num2==0){
        println("Division Can't be Performed")
    }
    else{
        println(num1/num2)
    }

    num2=5
    if(num2==0){
        println("Division Can't be Performed")
    }
    else{
        println(num1/num2)
    }

    //Which one is greater number
    if(num1>num2){
        println("$num1 is greater than $num2")
    }
    else{
        println("$num2 is greater than $num1")
    }

    //Assign greater number value to new variable called maxValue
    val maxValue : Int =if (num1>num2){
        num1
    }else{
        num2
    }
    println(maxValue)
}