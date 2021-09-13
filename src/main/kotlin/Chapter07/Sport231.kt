package Chapter07

/**
 * @author scott
 * @date 2021/9/10
 */
class Result(
    val player: Player,
    val category: Category,
    val result: Double
)

class Player(val name: String)

enum class Category { SWIMMING, RUNNING, CYCLING }

val results = listOf(
    Result(Player("Alex"), Category.SWIMMING, 23.4),
    Result(Player("Alex"), Category.RUNNING, 43.2),
    Result(Player("Alex"), Category.CYCLING, 15.3),

    Result(Player("MAX"), Category.SWIMMING, 17.3),
    Result(Player("MAX"), Category.RUNNING, 33.3),

    Result(Player("BOB"), Category.SWIMMING, 29.9),
    Result(Player("BOB"), Category.CYCLING, 18.0)

)

fun main() {
    val bestInCategory = results.groupBy { it.category }
        .mapValues { it.value.maxBy { it.result }?.player?.name }//书上的代码有问题，像是盗版书的质量。

    println(bestInCategory)//{SWIMMING=BOB, RUNNING=Alex, CYCLING=BOB}
}