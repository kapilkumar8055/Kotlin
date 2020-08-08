package classAndObjects

/*
 * Created by KAPIL KUMAR
 * 08-08-2020
 * 11:25 PM
 **/
class Dog {
    var name: String = "alex"
    var age: Int = 10
    fun eat() {
        println("$name eats!!")
    }

    fun bark() {
        println("$name barks!!")
    }
}

fun main() {
    val dog = Dog()                             //creating object of Dog class
    dog.eat()
    dog.bark()
    println(dog.age)

    //changing the value of Dog class variables
    dog.name="bhura"
    dog.age=12
    println(dog.name)
    println(dog.age)
    dog.bark()
    dog.eat()
}