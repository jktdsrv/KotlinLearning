data class Familiar (val name: String = "Vince", val age: Int = 27, val hairColor: String = "Grey")

data class Result(val result: Int, val status: Boolean)

fun calcular(a: Int, b: Int): Result {
    return if (a*2 > b){
        Result(a*2,true)
    } else {
        Result(a*2,false)
    }
}

fun main(args: Array<String>) {
    val vince = Familiar()

    val nombre = vince.name // En lugar de hacer esto, se puede deconstruir

    val (name,age,hairColor) = Familiar()

    // Si no quiero la edad
    val (nombres, _, color) = Familiar()

    println(nombres)
    println(color)

    val (resultado, status) = calcular(4,9) // Aquí estoy devolviendo un objeto

    println(resultado)
    println(status)

}