import java.io.File

fun main() {
    File("src/test.txt").forEachLine { println(it) }
}