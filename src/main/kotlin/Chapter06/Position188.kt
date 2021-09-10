package Chapter06

/**
 * @author scott
 * @date 2021/9/9
 */
interface BaseView
interface ProductView : BaseView
class Presenter<T>
class PresenterAtUse<T>//使用点处声明变型类型
class PresenterAtDeclear<out T> //声明点处指明变型修饰符,这种写法更简单。


fun main(args: Array<String>) {
//var presenter = Presenter<BaseView>()
//var productPresenter = Presenter<ProductView>()
//presenter = productPresenter  //会提示类型不匹配。也是之前说的逆变，协变的问题。

//使用2种方式，使用点和声明点来解决
//1：使用点修改变型。
    var presenter: PresenterAtUse<out BaseView> = PresenterAtUse<BaseView>()
    var productPresenter = PresenterAtUse<ProductView>()
    presenter = productPresenter

//2.声明点处知名变型修饰符
//    var presenter = PresenterAtDeclear<BaseView>()
//    var productPresenter = PresenterAtDeclear<ProductView>()
//    presenter = productPresenter


}

