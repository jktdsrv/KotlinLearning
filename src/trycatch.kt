import java.lang.NumberFormatException

fun fail(mensaje: String): Nothing {
    throw IllegalArgumentException(mensaje)
}

fun esNumero(dato: Any?) = dato is Int?

fun main(args: Array<String>) {
//    println("Ingresa algo: ")
//
//    val num: Any? = try {
//        readLine()?.toInt()
//
//    } catch (e: NumberFormatException){
//        "No es Int"
//    }
//
//    print("Variable: ")
//    println(num)
//    print("Funcion: ")
//    println(esNumero(num))

    var name = ""
    val persona: Person? = null

    try {
        name = persona?.name ?: fail("Nombre requerido")
    } catch (e: java.lang.IllegalArgumentException){
        println(e)
        println(name)
    }

}