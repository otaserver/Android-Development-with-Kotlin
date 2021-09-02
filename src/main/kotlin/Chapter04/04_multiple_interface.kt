interface A {
    fun foo() {
        println("A")
    }
}

interface B {
    fun foo() {
        println("B")
    }
}

class Item : A, B {
    override fun foo() {
        val a = super<A>.foo()
        val b = super<B>.foo()
        println("Item $a $b")
    }
}

fun main(args: Array<String>) {
    val item = Item()
    item.foo()
}
//书105页，结果和书上写的不一致，这书的质量也是够差的。还是我理解的不对？