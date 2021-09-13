abstract class Abs
class Bbs: Abs()
 
fun Abs.foo() { println("foo(A)") } //格式为扩展函数
fun Bbs.foo() { println("foo(B)") } //格式为扩展函数

fun main(args: Array<String>) {
    val b = Bbs()
    b.foo() // prints: foo(B) 
    (b as Abs).foo() // 1, prints: foo(A)
    val a: Abs = b
    a.foo() // 1, prints: foo(A)
}	