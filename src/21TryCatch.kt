import java.lang.ArithmeticException
import java.lang.Exception

/*
 * Created by KAPIL KUMAR
 * 07-08-2020
 * 11:35 PM
 **/
fun main(){
    val array= arrayOf(1,2,3,4,5)
    try {
        println(array[5])
    }
    catch (e:ArrayIndexOutOfBoundsException){
        println(e)
    }

    val a=5
    val b=0
    try {
        println(a/b)
    }
    catch (e:ArithmeticException){
        println(e)
    }
    finally{
        println("I am always executed")
    }

    //Null Exception
    val s: String? =null                //Without ? we can't store null to the string
    println(s)
    println(s?.length)
    println(s?.length ?: "This is null")     //   ?:-this is Elvis Operator
    val array1= arrayOf(1,2,3,null,4,null,5,null)
    println(array1.contentToString())
    println(array1.size)
    println(array1.filterNotNull())             //it does not show null value
}