package Chapter03

//书中69页的单表达式函数。
//注意，此实例使用了{}符号，其实并不是模板，只是使用{}表示一个可替换的变量。其实去掉{也能跑通。
fun textFormatted(text: String, name: String) = text
    .trim()
    .capitalize()
    .replace("name2}", name)


fun main(args: Array<String>) {
    val formatted = textFormatted("  hello,name2}  ", "mArcin")
    println(formatted)
}
