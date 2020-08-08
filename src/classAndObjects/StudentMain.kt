package classAndObjects

/*
 * Created by KAPIL KUMAR
 * 09-08-2020
 * 01:16 AM
 **/
fun main() {
    val student1 = Student("Kapil Kumar", "J")
    val student2 = Student("Vaishnavi chaurasia", "J")
    val student3 = Student("Kashish chaudhary", "J")
    val student4 = Student("Pratibha Sharma", "K")
    val student5 = Student("Parth Chauhan", "K")
    val student6 = Student("Kapil Kumar", "J")
    println(student1)


    val list = mutableListOf(student1, student2, student3, student4, student5, student6)
    val student7 = Student("sonu", "C")
    val student8 = Student("Shubham", "C")
    list.add(student7)
    list.add(student8)


    for (student in list) {
        println(student)
    }

    if (student1 == student6) {
        println("Same")
    } else {
        println("Not Same")
    }
}