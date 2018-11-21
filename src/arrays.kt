fun main(args: Array<String>) {
    val arrA : IntArray = intArrayOf(3,3,32,34,23,432,432,4,324,23,423,43)
    val listA : ArrayList<String> = arrayListOf("hola","lkasdjflkjsd","ajskdfsd")

    val num : Int = arrA[2]
    val sdf : String = listA[2]

    arrA[1] = 3333

    println(num)
    println(sdf)

    val mutableList = mutableListOf(2,3,34,4,4)
    mutableList.add(4,334)
    mutableList.add(1)
    mutableList[0] = 1

    val map = mutableMapOf<String, Int>(Pair("Key",30))
    map.put("Hola",27)

    println(map["Key"])

}