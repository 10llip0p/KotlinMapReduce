class Reduce {
    var count: Int? = null

    fun run(shuffledItems: ShuffledItems) {
        count = shuffledItems.list.size
        println(shuffledItems.key.toString() + " => " + count.toString())
    }
}