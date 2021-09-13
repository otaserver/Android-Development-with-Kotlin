package Chapter07

/**
 * @author scott
 * @date 2021/9/10
 */
data class Student3(val name: String, val grade: Double, val passing: Boolean)

val student3 = listOf(
    Student3("John", 4.2, true),
    Student3("Bill", 3.5, true),
    Student3("May", 3.2, false),//源代码是john影响阅读，改为may
    Student3("Aron", 4.3, true),
    Student3("Jimmy", 3.1, true)

)

val bestStudents = student3.filter { it.passing }
    .withIndex()
    .sortedBy { it.value.grade }//从小到大排序，jimmy，bill，john，aron
    .take(3)//jimmy，bill，john
    .sortedBy { it.index }//john，bill，jimmy，
    .map { it.value }

fun main() {
    println(bestStudents.map { it.name })//john，bill，jimmy，
}
