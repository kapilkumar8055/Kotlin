fun main(){
    //var-mutable
    var wholeNumber=10
    var fractionalNumber=0.5
    var sentence="i am kapil kumar"
    var condition=true;
    var num : Int =20
    var num2 : Float
    num2=12.5f

    //val-immutable
    val number=12
    val fraction=2.5
    val sentence2="i am from mathura"
    val condition2=true

    println("var variables")
    println(wholeNumber)
    println(fractionalNumber)
    println(sentence)
    println(condition)
    println(num)
    println(num2)

    wholeNumber=wholeNumber+10
    fractionalNumber=fractionalNumber+1.562
    sentence="hello kapil"
    condition=false
    num+=20
    num2+=12.5f

    println()
    println("var variables after changing the value")
    println(wholeNumber)
    println(fractionalNumber)
    println(sentence)
    println(condition)
    println(num)
    println(num2)

    println()
    println("val variables")
    println(number)
    println(fraction)
    println(sentence2)
    println(condition2)
}