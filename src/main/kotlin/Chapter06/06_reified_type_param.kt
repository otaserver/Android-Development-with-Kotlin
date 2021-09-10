interface View
class ProfileView : View
class HomeView : View

//195页，想检查一下类型实例。但是会提示，不能编译。
//fun <T> typeCheckErr(s:Any){
//    if(s is T){//这一行会提示不能检查擦除类型的实例。
//        println("The same types")
//    }else{
//        println("Different types")
//    }
//}

inline fun <reified T> typeCheck(s: Any) {
    if (s is T) {//按理说加入reified会在编译器把类型带进来。但只限于T。
        println("The same types")
    } else {
        println("Different types")
    }
}


fun main(args: Array<String>) {
    typeCheck<ProfileView>(ProfileView())//same
    typeCheck<HomeView>(ProfileView()) //different
    typeCheck<View>(ProfileView()) //same
}