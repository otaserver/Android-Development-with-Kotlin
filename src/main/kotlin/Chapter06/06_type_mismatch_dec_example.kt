//书上190页，演示了MutableList的不可变型特性。

fun addElement(mutableList: MutableList<Any>) {
    mutableList.add("Cat")
}

fun main(args: Array<String>) {
    val mutableIntList = mutableListOf(1, 2, 3, 4)
    val mutableAnyList = mutableListOf<Any>(1, 'A')
//    addElement(mutableIntList)//MutableList的不可变型
    //github上的源代码也能错，错了好几年也不改。也是服了这个作者。竟然还写书。
    addElement(mutableAnyList)
    println(mutableAnyList)

}