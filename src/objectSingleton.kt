import java.lang.NumberFormatException

object Validaciones{
//    fun passwordValidation(psw: String): Boolean{
//        return if(psw.length > 0 && psw.length < 10){
//            true
//        } else {
//        false
//        }
//    }

    fun passwordValidation(psw: String) = psw.isNotEmpty() && psw.length > 10 //Esto es lo mismo que el bloque de arriba

    fun esNumero(dato: Any) = dato is Int
}

fun main(args: Array<String>) {
    println("Ingresa contraseña: ")

    val psw: String = readLine()!! // Los dos signos de admiración sirven para que lo haga, incluso si es nulo.

    println(Validaciones.passwordValidation(psw))

    println("Ingresa algo: ")
//    val numero: Int = readLine()?.toInt() // Presenta error, porque la idea es que no sea nulo.
    try {
        val numero: Any = readLine()?.toInt() ?: "" // Con esto nos blindamos, pues si es null -> 0

        println(numero)
        println(Validaciones.esNumero(readLine()!!))
    } catch (e: NumberFormatException){
        print(e)
    }

    val claseUniversalEnMain = ClaseUniversal.create()
}

class ClaseUniversal{ // Crea un singleton de esta clase
    companion object {
        fun create(): ClaseUniversal = ClaseUniversal()
    }
}