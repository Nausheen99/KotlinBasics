fun test(o: List<Int>):List<Int>{
    var r = arrayListOf<Int>(o.size)
    while(r.size < o.size) r.add(0)
    var i =0
    var s = o.size-1

    while (i<=s){
        r[i]=o[s-i]
       i++
    }
    return r
    //print(r)
}

fun main() {
    val d = listOf(1,2,3,4,5)
    val p=test(d)
    print(p)
}