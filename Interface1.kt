interface Interface1 {
    var i: Int
    fun sum(a:Int,b:Int = 9):Int

}
class Ab :Interface1
{
    override var i: Int = 7
    override fun sum(a: Int, b: Int): Int {
        return a + b
    }

}
fun main()
{
    val o = Ab()
    println(o.sum(1))
    println(o.i)
}