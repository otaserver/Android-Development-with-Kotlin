package Chapter04

/**
 * @author scott
 * @date 2021/9/14
 */
public data class MyPair<out A, out B>(//这里泛型用了out关键字，其实out是泛型里对应协变。in是泛型里对应逆变。
    public val first: A,
    public val second: B
) {
    //    ) : Serializable1 {  //原文代码，但是这里Serializable不能访问。因为是内部类
    public override fun toString(): String = "($first ,$second)"
}

fun main() {
    var pair = MyPair("Test", true)
    println(pair)
}