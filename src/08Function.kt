/*
 * Created by KAPIL KUMAR
 * 03-08-2020
 * 06:35 PM
 **/
fun main(){
    printHello()
    printHello2()
    println(twoTimes(50))
    println(twoTimes2(7))
}
fun printHello()=println("hello")           //Function Body--Expression body

fun printHello2(){                           //Function Body--Block Body
    println("hello")
}

fun twoTimes(x :Int):Int{                   //Function Body--Block Body
    return x*2
}

fun twoTimes2(x :Int)=x*2                   //Function Body--Expression body