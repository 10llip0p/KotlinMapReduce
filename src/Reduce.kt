class Reduce {
    var count: Int? = null

    fun run(shuffledItems: ShuffledItems) {
        count = 0
        for (item : MapItem in shuffledItems.list) {
            count = count?.inc()
        }
        println(shuffledItems.key.toString() + " => " + count.toString())
    }
}