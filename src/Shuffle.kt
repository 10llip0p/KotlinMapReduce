import java.util.*

class Shuffle {
    fun createInstance(list: List<MapItem>) : LinkedList<ShuffledItems> {
        var shuffledItemsList: LinkedList<ShuffledItems> = LinkedList()
        var currentItem : MapItem? = null
        var si: ShuffledItems? = null

        //各文字ごとにshuffleしてリスト生成
        for (item : MapItem in list) {
            if (!item.equals(currentItem)) {
                currentItem = item
                si = ShuffledItems()
                si.key = item.key
                shuffledItemsList.add(si)
            }
            si!!.list.add(item)
        }
        return shuffledItemsList
    }
}