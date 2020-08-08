package classAndObjects

/*
 * Created by KAPIL KUMAR
 * 09-08-2020
 * 12:32 AM
 **/
class Car1{
    var brand :String
    var carName :String
    var model:Int
    constructor(brand : String,carName :String,model:Int){
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
fun main(){
    var car=Car1("tata","nano",2014)
    car.carInformation()
}