package Chapter06

/**
 * @author scott
 * @date 2021/9/9
 * 演示如果方法是私有的。则in和out的限定被忽略了。
 */

class ConsumerProducerPrivate<in T, out R> {
    private fun consumeItemT(t: T): Unit {}
    private fun consumeItemR(r: R): Unit {}

    private fun produceItemT(): T? {
        return null
    }

    private fun productItemR(): R? {
        return null//因为示例，没有定义R，所以这里返回null
    }

}