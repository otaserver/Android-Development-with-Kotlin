package Chapter06

/**
 * @author scott
 * @date 2021/9/9
 *
 */
class Producer<out T>(t: T)
//解析：构造器里有泛型定义，且泛型定义只能是输出参数。

val stringProducer = Producer("A")
val anyProducer: Producer<Any> = stringProducer

//val常量可以作为构造器参数，因为是只读。因为生成get方法。属性值无法再实例化后被修改。
class ProducerVal<out T>(val t: T)

// 当使用var时，get和set均由编译器生成，因此，属性值可以在某点出发生变化，所以没法使用var关键字。
//class ProducerVar<out T>(var t:T)

//使用private关键字，变为私有属性。就可以了。因为变型限定条件仅适用于外部客户端。
class ProducerPirvate<out T>(private var t: T)
