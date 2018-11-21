fun main(args: Array<String>) {
    val listaNumeros = intArrayOf(1,2,3,4,5,6,7,8)

    for (i in listaNumeros.indices){
        println(listaNumeros[i])
    }

    val asdf = listaNumeros.map { i ->
        println(i)
        i + 20
    }

    listaNumeros.forEach { i -> println(i) }

    asdf.map { i -> println(i) }

    val fdsa = listaNumeros.flatMap { i -> intArrayOf(i * 10).asIterable() }

    fdsa.map { i -> println(i) }


    val frutas = listOf("manzana", "uva", "mango", "banana")

    for(fruta in frutas){
        println(fruta)
    }

    var x = 3
    while (x > 0){
        x--
        println(x)
    }


    var suma: Int = 0
    var input: String? // ? para indicar que quizás sea nulo
    do {
        println("Ingresa un número: ")
        input = readLine()
        suma += input?.toInt() ?: 0
    } while (input != "0")

    println("La suma es $suma")


}
