import java.util.Collections.sort
import java.util.concurrent.CountDownLatch
import kotlin.concurrent.thread

class Counter {
    fun count(target: List<String>) {
        val map = Map()
        val countDownLatch = CountDownLatch(target.size)
        for (targetString : String in target) {
            //行ごとに並列してMap処理
            thread {
                map.run(targetString)
                countDownLatch.countDown()
            }
        }
        countDownLatch.await()
        sort(map.list)
        val ShuffledItemsList = Shuffle().createInstance(map.list)
        for (shuffleItems : ShuffledItems in ShuffledItemsList) {
            //shuffleされた文字ごとにReduceを実行
            thread {
                Reduce().run(shuffleItems)
            }
        }
    }
}