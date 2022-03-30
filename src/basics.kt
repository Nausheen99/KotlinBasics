import java.util.Scanner

fun main() {

    var s : String?  = "Do you work work work work work?"
    //val i = 'd' in s
    //println(i)
    s = null
    val no = "I'm batman huihuihui"
    luke(no)
    //area()
    //toyd()
    //println(casst(s))
    //maploop()

    //val l = if (s != null) s.length else "no"
    //println(l)
    //val l = s?.length ?: "no"
    val m = s ?: "oh no"
    println(m)

}

fun maploop(){
    //hashmaps and loops
    val characters = arrayListOf("Naruto","Sasuke","Neji","Kakashi")
    val charMap = hashMapOf("Naruto" to "Rasingan", "Sasuke" to "Chidori", "Neji" to "Bakugan", "Kakashi" to "Thousand Years of Death")

    for (r in characters){
        println("Name: $r")
    }

    for ((key,value) in charMap){
        println("$key's special move is $value")
    }


}
fun area(){
    println("Enter width, length")
    val width = readLine()
    val length = readLine()
    var area = 0
    if (length != null) {
        if (width != null) {
            area = length.toInt() *width.toInt()
        }
    }
    println(area)
}
fun toyd(){
    val minutesinyears = (60*24*365)
    var min = Scanner(System.`in`).nextDouble()
    val y = min/minutesinyears.toLong()
    val d = min/60/24.toInt() % 365
    println("Years $y, days $d")

}

fun casst(obj:Any):Int?{

    if (obj is String)
        return obj.length
    return null
}

fun luke(say: String){

    println(say)
}

