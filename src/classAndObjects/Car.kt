package classAndObjects

/*
 * Created by KAPIL KUMAR
 * 08-08-2020
 * 11:57 PM
 **/
class Car(var brand: String, var carName: String, var Model: Int) {
    fun carInformation() {
        println(brand)
        println(carName)
        println(Model)
    }
}

fun main() {
    val car = Car("TATA", "Tata Sumo", 2020)
    car.carInformation()
    println(car.carName)

    val car1 = Car("Mahindra", "Bolero", 2020)
    car1.carInformation()
}


/*
Above class also written as


class Car(brand : String,carName :String,model:Int) {
    var brand :String
    var carName :String
    var model:Int
    init {
        this.brand=brand
        this.carName=carName
        this.model=model

    }
    fun carInformation(){
        println(brand)
        println(carName)
        println(model)
    }
}
*/

/*
Above class also written as

class Car(brand : String,carName :String,model:Int) {
    var brand :String = brand
    var carName :String = carName
    var model:Int = model
    fun carInformation(){
        println(brand)
        println(carName)
        println(model)
    }
}*/
