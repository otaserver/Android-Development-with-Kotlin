class Student2(val name: String, val classCode: String, val meanGrade: Float)

val students2 = listOf(
    Student2("Homer", "1", 1.1F),
    Student2("Carl", "2", 1.5F),
    Student2("Donald", "2", 3.5F),
    Student2("Alex", "3", 4.5F),
    Student2("Marcin", "3", 5.0F),
    Student2("Max", "1", 3.2F)
)

val bestInClass = students2
    .groupBy { it.classCode }
    .map { (_, students) -> students.maxBy { it.meanGrade }!! }//!!代表断言非空。如果还为空，就抛出异常。
    .map { it.name }

fun main(args: Array<String>) {
    print(bestInClass)//Max，Donald，Marcin，//实际结果是每组取1个。
}