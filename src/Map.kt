import java.util.*

class Map {
    val list = Collections.synchronizedList(LinkedList<MapItem>())

    fun run(target: String) {
        val str = target.toCharArray()
        for (chr in str) {
            val item = MapItem(chr)
            list.add(item)
        }
    }
}