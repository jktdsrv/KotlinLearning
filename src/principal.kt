fun main(args: Array<String>) {
    val srt = "Una cadena de String normal"

    val nombre = "Mabel"

    val edad = 25

    val sentencia = "Ella es $nombre y tiene $edad años"

    val cumpl = "$nombre cumple ${edad+1} años mañana"

    val text:String = """
    >Este es un String
    que tiene varios renglones
    >y muchas mas cosas etc
    """.trimMargin(">")

}