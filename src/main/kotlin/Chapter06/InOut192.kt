package Chapter06

/**
 * @author scott
 * @date 2021/9/9
 */

class ConsumerProducer<in T, out R> {
    fun consumeItemT(t: T): Unit {}

//    fun consumeItemR(r:R) :Unit {}//错误：因为R是输出定义
//    fun produceItemT():T {} //错误，因为T是个输入定义

    fun productItemR(): R? {
        return null//因为示例，没有定义R，所以这里返回null
    }

}