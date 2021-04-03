interface Interface2 {
    var a:Int
    var str:String
    //get() = "hello"
}
class Abcd : Interface2{
    override var a: Int = 87
    override var str: String = "hello world"
}
fun main()
{
    var o = Abcd()
    println(o.str)
    println(o.a)

}