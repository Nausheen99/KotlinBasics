import java.io.File



fun main() {

    var list:ArrayList<String> = arrayListOf()
    File("src/60.ips.txt").forEachLine {
        list.add(it)
    }

    println(list.size)


 /*   for ( row in list){
        for (row)
    }*/

    println(list.groupingBy { it }.eachCount().filter { it.value > 1 })
//    println(maxOf(list.groupingBy { it }.eachCount()))

}