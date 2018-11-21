fun type(dato: Any){
    when (dato) {
        is String -> {
            println(dato.length)
        }
        is Int -> println("${dato * 2}")
        is Boolean -> println("Es un boolean $dato")
        is Person -> println("${dato.name} y ${dato.age}")
        else -> println("No sé qué objeto es")
    }
}

//fun whoIs(persona: Person){
//    when (persona.name){
//        "Pedro" -> "Es ${persona.name}"
//        else -> "No sé quién es ${persona.name}"
//    }
//}



 fun whoIs(persona: Person) = // Esto quiere decir que retorna.
    when (persona.name){
        "Vince", "Santi", "Raul" -> { // Puedo evaluar varios en la misma línea
            val text = "Text"
            "Puedes abrir la puerta" // Retorna el último
            text
        }
        "Pedro" -> "Es ${persona.name}"
        else -> "No sé quién es ${persona.name}"
    }


fun main(args: Array<String>) {
//    type(Person("Pedro",4,"Azules"))
//    whoIs(Person("Pedro",4,"Azules"))
//    println(whoIs(Person("Vince",4,"Azules")))
    rango(10)


}

fun rango(numero: Int){
    when (numero) {
        in 1..10 -> println("Numero positivo entre 1 y 10")
        in 10..100 -> println("Numero positivo entre 10 y 100")
        else -> println("Fuera de rango")
    }
}