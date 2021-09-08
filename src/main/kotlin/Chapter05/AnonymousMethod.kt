package Chapter05

/**
 * @author scott
 * @date 2021/9/3
 */

//书142页的匿名函数例子
val a: (Int) -> Int = fun(i: Int) = i * 2
//解析：
//val表示a为一个常量，
//使用：表示他的类型是一个函数表达式，不是单纯的对象类型。
//下例是单纯的对象类型的示例，可以对比一下：var fruit:String，这个例子是指fruit是String类型变量。
//所以能够知道，这里a的类型是一个函数类型，正好()->也是函数类型的表达式。括号内的Int表示函数类型的输入是Int，->后面的Int表示返回类型是Int
//第一个=表示定义了一个匿名函数，省略了函数名称，只有函数的参数，分别为Int类型的输入，
//第二个=表示是具体的函数体，由于输入是Int，返回也是Int类型。

val b: () -> Int = fun(): Int { return 4 }

//解析：
//b的类型是一个函数类型，不是单纯的对象类型。输入是空，输出是Int类型。
//本例使用了匿名函数，没有函数名称，只有函数体，
val c: (String) -> Unit = fun(s: String) { println(s) }
//解析：
//c类型是一个函数类型。输入是String，没有输出。

//由于kotlin可以自行进行类型推断。故可以简写后如下
//其实没那么复杂，都是直接去掉【函数类型】就可以了
var aMini = fun(i: Int) = i * 2    //省略了函数类型

//解析：原表达式：val a: (Int) -> Int = fun(i: Int) = i * 2
//看到a的类型是函数类型，由于kotlin可以自行推断，就把输入输出的类型都可以省略掉。直接写函数体，省去了冒号和函数类型表达式。变为上面的表达式。
var aMini2 = fun(i: Int) { i * 2 } //注意：使用了{}，没有返回，所以为Unit类型

//解析:原表达式：val b: () -> Int = fun(): Int { return 4 }
//如果使用kotlin的自动推断。修改后的表达式为：
var bMini = fun(): Int { return 4 } //使用了return 作为返回

//解析：原表达式：val c: (String) -> Unit = fun(s: String) { println(s) }
//使用kotlin的自动类型推断，把声明的函数类型去掉。
var cMini = fun(s: String) { println(s) }
var cMini2 = fun(s: String) = println(s) //这种写法式和上面表达式时一致的。

fun main(args: Array<String>) {

//    println("-----------常规调用----------")
//    println(a(10))
//    println(b())
//    c("普通kotlin匿名函数")

    println("-----------使用kotlin自动类型推断，省略函数类型声明----------")
//    println(aMini(20))
//    println(aMini2(20))//注意返回了unit类型。
//    println(bMini())
    cMini("kotlin匿名函数，简写了数据类型")
    cMini2("kotlin匿名函数，简写了数据类型")

    println(cMini("测试有无返回值，应该是无返回值"))
    println(cMini2("测试有无返回值，应该是无返回值"))

//    使用invoke调用关键字，有同样效果
//    println("-----------使用invoke关键字调用，效果一样---------")
//    println(a.invoke(30))
//    println(b.invoke())
//    c.invoke("使用invoke调用")


}