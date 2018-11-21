fun hello():Unit{
    println("hola a kotlin")
}

fun suma(a:Int,b:Int):Int{
    println("la suma de $a y $b es igual a ${a+b}")
    return a + b
}

//fun max(a:Int, b:Int):Int{
//    return if (a > b)
//        a
//    else
//        b
//}

fun max(a:Int, b:Int) = if (a > b) a else b

fun main(args: Array<String>) {
    println(max(4,5))
    println(suma(2,76))
    print(max(3,3))
}