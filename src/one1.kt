import java.util.*
import kotlin.random.Random.Default.nextInt

fun main(){
    var books = arrayListOf("a thousand splendid suns","forty rules of love","no")
    for (b in books) {
        if (b.contains('e')) {
            for (c in b) {
                println(c)
            }
        }
    }
}
