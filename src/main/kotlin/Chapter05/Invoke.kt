package Chapter05

/**
 * @author scott
 * @date 2021/9/3
 */

fun main(args: Array<String>) {
    //书143页例子.演示inoke的使用。因为这种情况是无法使用tab(3)的，只能使用tab?.invoke(3)
    var tab: ((Int) -> Int)? = null
    //解析： tab是一个【函数类型】的变量。根据函数类型定义（）->,
    // 函数类型为输入是Int,输出是Int,后面用括号括起来加上？表示该变量可能为空，
    // 等号后面就是赋值，表示tab就是null
    // 这一行表达式可以看作是tab的定义和默认赋值。
    if (true) tab = fun(i: Int) = i * 2
    //解析：前方用一个布尔表达式来开启tab的第二次赋值。
    // 如果为false，则下方调用直接就是tab传入null，打印应该为null。
    // 如果为true，二次赋值也是一个匿名表达式，输入是Int类型，输出是int*2的结果。
    // 如果去掉布尔表达式，则tab也是二次赋值。和true的结果是一致的。
    // 由于在tab匿名函数中定义输入是int，所以invoke的参数不能是null，否则编译都不会通过。
    // 第一行的null表示【函数类型】的结果可能为null，可以省略不写。
    println(tab?.invoke(3))  //？.为安全调用符，当a不为空时才调用。
}