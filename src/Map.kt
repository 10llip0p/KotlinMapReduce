import java.util.*

class Map {
    //val list: LinkedList<MapItem> = LinkedList()
    val list = Collections.synchronizedList(LinkedList<MapItem>())

    fun run(target: String) {
        val bs : ByteArray = target.toByteArray()
        for (b in bs) {
            val item = MapItem(b.toChar())
            list.add(item)
        }
    }
}