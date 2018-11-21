class Ejemplo{
    fun hola(){
        println("hola Kotlin")
    }

}

class Persona (nombre:String){
    init { //Bloque que se ejecuta cuando crean la clase
        println("Nombre: $nombre")
    }

    constructor(name:String, edad:Int) : this(name){
        println("Nombre: $name, edad: $edad")
    }
}

fun main(args: Array<String>) {
    val persona = Persona("Vincent", 23)
    println(persona.toString())
    val general = General(4)
    general.imprimeAlgo()

}

open class Base(val inicial:Int){
    open fun imprimeAlgo(){
        println("Algo $inicial")
    }
}

class General(val d:Int) : Base(d){
    override fun imprimeAlgo() {
        super.imprimeAlgo()
        val suma : Int = 4 + d
        println(suma)
    }

}