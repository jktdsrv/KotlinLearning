//sealed class Intencion{
//    class Refrescar: Intencion()
//    class RecargarMas: Intencion()
//}
//
//fun main(args: Array<String>) {
//    val intencion: Intencion = Intencion.Refrescar()
//
//    val output = when (intencion){
//        is Intencion.Refrescar -> "refresh"
//        is Intencion.RecargarMas -> "cargar más data"
//    }
//
//    println(output)
//}

sealed class Intencion{
    object Recargar: Intencion(){
        override fun log() {
            println("Refrescando")
        }
    }

    object CargarMasDatos: Intencion(){
        override fun log() {
            println("Cargar más datos")
        }
    }


    data class Error(val razon: String): Intencion() {
        override fun log() {
            println(razon)
        }
    }

    abstract fun log()
}

fun main(args: Array<String>) {
    val intencion: Intencion = Intencion.Error("Me quedé sin internet")
    val output = when(intencion){
        is Intencion.CargarMasDatos -> "Carga más datos"
        is Intencion.Recargar -> "Recargar datos"
        is Intencion.Error -> "Error!"

    }


    intencion.log()
    println(output)
}