class MapItem (key: Char) : Comparable<MapItem> {
    val key = key

    override fun compareTo(other: MapItem): Int {
        return other.key - this.key
    }

    override fun equals(other: Any?): Boolean {
        if (other == null) {
            return false
        }
        else {
            return (other as MapItem).key == this.key
        }
    }

    override fun hashCode(): Int {
        return this.key.toInt()
    }
}