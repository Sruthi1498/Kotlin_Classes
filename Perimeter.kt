interface Perimeter {
    val l : Int
    val b : Int
}
interface Cal : Perimeter
{
    fun peri(): Int
    fun area(): Int
}
class Rect(override val l: Int, override val b: Int) : Cal{
    override fun peri(): Int {
        return 2*(l+b)
    }

    override fun area(): Int {
        return l*b
    }

}

//multiple inheritance
class Rect1(override val l: Int, override val b: Int): Cal,Perimeter
{
    override fun peri(): Int {
        return 2*(l+b)
    }

    override fun area(): Int {
        return l*b
    }
}
fun main()
{
    val obj = Rect(5,7)
    println(obj.peri())
    println(obj.area())


    val ob = Rect1(6,3)
    println(ob.peri())
    println(ob.area())
}