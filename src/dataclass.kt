data class Auto(var marca: String, private var puertas:Int){ // Si le pongo val entonces sólo es el get, si le pongo var es como si también le pusiera el set.

    var numPuertas = puertas
    get(){
        return if (field > 0) field else 1
    }


}
data class Person(var name:String, var age:Int, val eyeColor:String)

fun main(args: Array<String>) {
    val auto = Auto("BMW", 2)

    var marca : String = auto.marca

//    auto.marca = "Ford"

    println(auto.hashCode())
    println(auto.toString())
    println(auto.numPuertas)

    val mabel = Person("Mabel",23,"Verdes")

    mabel.age = 24

    val marla:Person = mabel.copy("Marla")

    println(mabel)
    println(marla)
    println("--------------")


    val darla:Person = mabel // Aquí está haciendo asignación por referencia

    darla.name = "Darla" // Esto tambíen cambia el name de mabel

    println(mabel)
    println(marla)
    println(darla)


}