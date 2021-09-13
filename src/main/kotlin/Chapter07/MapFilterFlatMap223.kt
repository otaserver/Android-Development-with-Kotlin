package Chapter07

/**
 * @author scott
 * @date 2021/9/10
 */
//自己写一个扩展函数，
inline fun <T, R> Iterable<T>.mapLisd(transform: (T) -> R): List<R> {
    //解读：使用了扩展函数方式对Iterable进行了扩展。
    //【函数类型】参数为T，返回类型为R，因为是高阶函数，transform代表传入的是一个函数。
    //返回结果是List<R>。
    val destination = ArrayList<R>()   //先定义一个返回类型。
    for (item in this) destination.add(transform(item)) //this指的是Iterable对象。
    return destination
}

//因为没有输出，所以只需要定义泛型<T>,为输入。
inline fun <T> Iterable<T>.filterLisd(predicate: (T) -> Boolean): List<T> {
    val destination = ArrayList<T>()
    for (item in this) if (predicate(item)) destination.add(item)//predicate(item)代表执行输入函数，实际结果会返回boolean值。
    return destination
}

inline fun <T, R> Iterable<T>.flatMapLisd(transform: (T) -> Collection<R>): List<R> {
    //【函数类型】参数为T，返回类型为一个泛型集合R
    val destination = ArrayList<R>()
    for (item in this) destination.addAll(transform(item))
    return destination
}

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3).mapLisd { it * 3 }//it*3代表传入的是一个高价函数。
    println(list)

    val listFilter = listOf(1, 2, 3).filterLisd { it > 2 }
    println(listFilter)

    val listflatMap = listOf(1, 2, 3).flatMapLisd { listOf(it, it + 1) }//返回一个集合，集合是输入为单一item，输出是item和item+1.
    println(listflatMap)//结果为：1，2，2，3，3，4

    (1..10).filter { it % 3 == 0 }
        .onEach(::print)//TODO:2个冒号代表什么？？需要更多例子。
        .map { it / 3 }
        .forEach(::print)
//此例子可以看出流程，即使是onEach循环，也是选执行完onEach，在执行forEach，而不是循环嵌套。
//流式调用，可以理解为责任链中的一步一步执行。
}