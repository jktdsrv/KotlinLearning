fun main(args: Array<String>) {
    "Hola mi name es sebastián".print() // Directamente el string ya es capaz de imprimirse
    println(3.multiply(2))
    println(4 multiply 5)

    val listaNombres = mutableListOf("Perro", "Gato", "Holi", "Socio")
    println(listaNombres)
    listaNombres.swap(1,3)
    println(listaNombres)
}

fun String.print(){ // Darle una capacidad nueva a un objeto String
    println(this)
}

infix fun Int.multiply(a: Int): Int{ // Esto es para poder poner 4 multiply 5
    return this*a
}

fun <T> MutableList<T>.swap(index: Int, index2: Int){
    val tmp = this[index]
    this[index] = this[index2]
    this[index2] = tmp

}