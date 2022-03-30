fun main() {
    val nametoages = mapOf(Pair("Nausheen",22), Pair("Uzma",29))
    val names2ages = mutableMapOf(
        "Naush" to 22,
        "Uzz" to 29
    )
    names2ages.put("Baseer", 27)
    names2ages.putIfAbsent("Azfar", 25)

    println(names2ages)
}
