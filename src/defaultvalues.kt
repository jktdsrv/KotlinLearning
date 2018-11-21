fun saluda(saludo: String = "Hola a todos"){// Este string se ejecuta si no se le pasa ningún parámetro
    println(saludo)

}

fun main(args: Array<String>) {
    saluda("Hola qué onda")
    saluda()

    otraFuncion()
    otraFuncion(3,true)
    otraFuncion(b = true)

    val computer1 = Computer(ram = 256)
    println(computer1)
}

fun otraFuncion(a:Int = 0, b:Boolean = false){ // Valores default en data class
    println("el int: $a y el booleano: $b")
}

data class Computer(var procesador:String = "AMD", var ram:Int = 512)

