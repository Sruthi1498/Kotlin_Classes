class Extension1(val radius: Double) {
    fun area():Double{
        return Math.PI * radius * radius
    }
}
fun main()
{
    fun Extension1.peri() : Double
    {
        return 2 * Math.PI * radius
    }
    val o = Extension1(5.0)
    println("The are of a circle is ${o.area()}")
    println("The perimeter of a circle is ${o.peri()}")
}