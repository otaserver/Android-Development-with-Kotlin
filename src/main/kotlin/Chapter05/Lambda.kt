package Chapter05


/**
 * @author scott
 * @date 2021/9/7
 */
fun main(args: Array<String>) {
//    书上144页。
//    尽管lambda会返回最后一条语句，但是return关键字在这里还是不被允许。
//    var a :(Int) -> Int ={i:Int -> return i*2 }

    //解析：标签的格式为标识符后跟@符号，比如：l@。
    //这里演示的是lambda的标签处返回例子。
    var l: (Int) -> Int = l@{ i: Int -> return@l i * 2 }
    var m: (Int) -> Int = { i: Int -> i * 2 }  //这个和上行代码的处理结果是一致的，但没有使用lambda的标签处返回特性。

    println(l.invoke(5))
    println(m.invoke(5))

    //此示例演示了lambda可以使用全部属性和函数。因为text在lambda表达式外部。
    val text = "lambda可以使用全部属性和函数，并且可以修改，这个特点是kotlin和java8的最大差别"
    var i: Int = 1
    //能够修改局部变量的lambda表达式叫做闭包。
    var a: () -> Unit = { println(text);i++ }//分号;代表把多行代码放在1行里

    a()
    println("调用闭包的lambda函数后，i的值修改了，i=2了")
    println(i)//

    print("再次调用a的lambda函数")
    println(a())//但是这里没有返回值，故返回的是Unit。看【函数类型】也能够看出来。
    println("调用闭包的lambda函数后，i的值修改了，i=3了")
    println(i)//可以看到调用后，i的值又更改了。

    //一个【函数类型】定义为空输入，返回值为Int的lambda闭包例子。
    //由于lambda表达式中{arguments-> function body}，没有输入，所以就把arguments->去掉了。
    var b: () -> Int = { i++ }
    println("b的lambda函数，返回的是当前的i值，i=3")
    println(b())//测试返回
    println("b的lambda函数，i++执行后，i=4")
    println(i)//可以看到调用后，i的值又更改了。
}