fun main(args: Array<String>) {
    val a: String = "abc"

    var b:String? = "abc" // Con ? Kotlin sabe que la variable podría llegar a ser nula.
    b = null

    val lA = a.length

    val lB = b?.length ?: 0 // Variable es nula? Sí, entonces se ejecuta lo primero: 0

    val lC = if (b != null){ // Esto es lo mismo que la línea anterior
        b.length
    } else {
        0
    }


    println(lA)

    println(lB)

    val person: Person? = Person("Vince",27,"cafés")

    val nombre = person?.name


    person?.let {
        // La persona no es nula
    }

    person.let {
        // La persona es nula
    }





}