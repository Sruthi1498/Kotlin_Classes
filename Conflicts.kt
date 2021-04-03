interface Conflicts {
    fun a()
    {
        println("interface 1")
    }
}
interface Conflicts1
{
    fun a()
    {
        println("interface 2")
    }
}
interface Conflicts2
{
    fun a()
    {
        println("interface 3")
    }
}
class Main():Conflicts,Conflicts1,Conflicts2
{
    override fun a() {
        super<Conflicts>.a()
        super<Conflicts1>.a()
        super<Conflicts2>.a()
    }

}
fun main()
{
    val o = Main()
    o.a()
}