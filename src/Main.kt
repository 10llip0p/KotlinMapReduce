import java.io.File

fun main(args: Array<String>) {
    val target = File("sample/sample.txt").readLines()
    Counter().count(target)
}