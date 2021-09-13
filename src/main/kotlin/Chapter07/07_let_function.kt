    val text = "hello {name}" 
 
    fun correctStyle(text: String) = text 
       .replace("hello", "hello,") 
 
    fun greet(name: String) { 
        text.replace("{name}", name)  //hello reader
           .let { correctStyle(it) }   //hello， reader
           .capitalize()   //Hello， reader 注意这里是只大写首字母。
           .let { print(it) }  //let有返回值，这里是unit。
    }

	
fun main(args: Array<String>) {
	greet("reader")  //
}