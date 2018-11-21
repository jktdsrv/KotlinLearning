fun main(args: Array<String>) {

    val a = esMayor(6)
    defineTipo(10)
    defineTipo(Person("Pedro", 3, "Rojos"))

}

fun esMayor(data: Int): Boolean {
    return if (data > 0) {
        println("$data")
        true
    } else {
        println("$data")
        false
    }
}


fun defineTipo(data: Any){
    if (data is String){
        print(data.length)
    } else if (data is Int){
        println("${data * 2}")
    } else if (data is Person) {
        println(data.name)
    }
}