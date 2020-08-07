/*
 * Created by KAPIL KUMAR
 * 07-08-2020
 * 10:53 PM
 **/
fun main() {
    //Immutable List
    val list = listOf<Int>(10, 20, 30, 40, 50)
    println(list)
    println(list.size)              //return the size of list

    //Mutable List
    val mutableList = mutableListOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println(mutableList)
    mutableList.add(20)                 //Add new item to the list
    mutableList.add(0, 100)
    println(mutableList)
    mutableList.remove(100)             //remove item from the list
    mutableList.removeAt(9)
    println(mutableList)
    println(mutableList.size)
    println(mutableList)

    //ArrayList
    val arrayList = arrayListOf('a', 'b', 'c', 'd', 'e')
    println(arrayList)
}