data class Tiempo (val years: Int, val days: Int)

operator fun Tiempo.plus(other: Tiempo): Tiempo { //Operator es para indicar a Kotlin que vamos a sobrecargar un operador
    return Tiempo(this.years + other.years,
            this.days + other.days)
}

data class Contador(var index: Int) {
//    operator fun Contador.inc(): Contador{// No es necesario poner Contador.inc()
    operator fun inc(): Contador{
        return Contador(index + 1)
    }

}

fun main(args: Array<String>) {
    val tiempo1 = Tiempo(2000,30)
    val tiempo2 = Tiempo(100,2)

    val sumaDelTiempo = tiempo1 + tiempo2

    println(sumaDelTiempo)

    var contador = Contador(2)
    val contador1 = Contador(3)



    println(contador.inc())
    println(++contador)

    println(contador.hashCode())
    println(contador1.hashCode())


}