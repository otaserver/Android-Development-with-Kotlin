fun main(args: Array<String>) {
//    val mutableList = mutableListOf(1)  //书上重复了，代码也重复了。服了作者和译者。
    val mutableList = mutableListOf(1)
    val letResult = mutableList.let {
        it.add(2)
        listOf("A", "B", "C")
    }
    println(letResult) // Prints: [A, B, C]
    println(mutableList)
    //解析：let是要求有返回值的。所以最后返回A，B，C。let返回的不是原来的对象，而是闭包里面的值。

    println("---do apply---")
    //此时mutableList为 1,2
    val applyResult = mutableList.apply {
        add(3)
        listOf("A", "B", "C")
    }
    println(applyResult) // Prints: [1, 2, 3]
    //解析：apply是返回原来的值。所以结果为1，2，3

    println("---do also---")
    val alsoResult = mutableList.also {
        it.add(4)
        listOf("A", "B", "C")
    }
    println(alsoResult) // Prints: [1, 2, 3, 4]

    val runResult = mutableList.run {
        add(5)
        listOf("A", "B", "C")
    }
    println(runResult) // Prints: [A, B, C]
    //run返回表达式最后一行。

    val withResult = with(mutableList) {
        add(6)
        listOf("A", "B", "C")
    }
    println(withResult) // Prints: [A, B, C]
    //with函数和前面的几个函数使用方式略有不同，因为它不是以扩展的形式存在的。它是将某对象作为函数的参数，
    //在函数块内可以通过 this 指代该对象。返回值为函数块的最后一行或指定return表达式。

    println(mutableList) // Prints: [1, 2, 3, 4, 5, 6]
}