package Chapter03


/**
 * @author scott
 * @date 2021/8/31
 * State 是自己补充的数据类
 */
class State(var n: Int) {
    fun nextState(): State {
        println("nextState ${n}")
        return State(n - 1)
    }
}

tailrec fun getState(state: State, n: Int): State =
    if (n <= 0) state
    else getState(state.nextState(), n - 1)

//测试超过10000，不使用tailrec就会报堆栈溢出。
fun main(args: Array<String>) {
    getState(State(50), 10000)
}

//参考《零基础学kotlin编程》70页，最终编译是使用了一个while循环来完成的代码结构。这时转换为了java的代码。
//public static final State getState(@NotNull State state,int n){
//    while (true){
//        if (n<=0){
//            return state;
//        }
//        state=state.nextState();
//        n=n-1;
//    }
//}
