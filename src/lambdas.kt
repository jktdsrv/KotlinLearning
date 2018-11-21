import kotlin.math.min

data class Automovil(val color: String, val llantas: Int, val puertas: Int)



fun main(args: Array<String>) {
    val num: Int? = null

    val miAutomovil: Automovil? = Automovil("Rojo",3,4)
    num?.let {  } // Let ejecuta un código dependiendo de si es nulo o no.

    miAutomovil?.let {
        miAutomovil.puertas
        it.puertas
        with(it){
            puertas
            color
            llantas
            // Como al with le mando el it, entonces ya puedo entrar a todas sus propiedades.
        }
    }




    val resultado = sum(3,4)

    println(resultado)

    println(minCuatro("Hola peqkus"))
}

val sum: (Int, Int) -> Int = { x, y -> x + y }

val minCuatro: (String) -> Boolean = {it.length > 4} //it quiere decir "el argumento de la función"