fun main()
{
    data class man(val name:String, val id:Int)
    {
        var salary : Double = 0.0
    }

    val o = man("alice",123)
    o.salary = 670.8

    println(o.toString())
    println(o.salary)
}