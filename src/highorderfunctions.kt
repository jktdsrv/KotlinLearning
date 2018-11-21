fun suma(num1: Int, num2: Int, func: () -> Unit){ // Dos enteros y una función como parámetro
    func()
    println("Suma de $num1 y $num2 = ${num1 + num2}")
}


fun main(args: Array<String>) {
    "Hola".funcion {
        println(it)
    }

    with("hola"){
        print(length) // El with recibe un objeto y puede entrar a todas sus propiedades.
    }

    suma(3,4) { // En estos brakets está la función que yo quiero enviar
        9 + 8
        if ("".isBlank()){
            println("Otra")
        }
        println("Función de orden mayor")
    }
}


fun String.funcion(func: (String) -> Unit) {
    func(this) // Para que le mande el mismo objeto que llamó la función
    println(this.length)

}