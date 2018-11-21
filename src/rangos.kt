fun main(args: Array<String>) {

    for (i in 1..4){
        print("${i} ")
    }

    println()

    for (i in 4 downTo 1){
        print("${i} ")
    }

    println()

    for (i in 1..100 step 2){
        print("${i} ")
    }

    println()

    for (i in 100 downTo 1 step 2){
        print("${i} ")
    }

    println()

    for (i in 1 until 10){
        print("${i} ") // Imprime sin el 10
    }

    println()

    val esOnce = (1..12 step 2).last == 11 // Voy a hacer pasos de 2 y mirar si el último es 11, y guarda en variable.
    print(esOnce)


}