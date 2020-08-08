package classAndObjects

/*
 * Created by KAPIL KUMAR
 * 09-08-2020
 * 12:40 AM
 **/
class Dog1(var name: String, var age: Int) {

    var ownerName: String? = null

    constructor(name: String, age: Int, ownerName: String) : this(name, age) {
        this.ownerName = ownerName
    }

    fun eat() {
        println("$name eats!!")
    }

    fun bark() {
        println("$name barks!!")
    }

    fun info() {
        println("Owner name : $ownerName\nDog name : $name")
    }
}

fun main() {
    var dog = Dog1("kitu", 8)                      //using primary constructor
    dog.bark()
    dog.eat()
    dog.info()

    var dog1 = Dog1("bhura", 12, "Amit")          //using primary constructor and Secondary constructor
    dog1.bark()
    dog1.eat()
    dog1.info()
}