fun main()
{
    data class Person(val name:String, val id:Int)
    {
        var salary : Int = 0
    }

    val o = Person("Alice", 10)
    o.salary = 90000
    println("details = $o and salary id ${o.salary}")

    val o1 = o.copy()
    o1.salary = 80000
    println("details  = $o1 and salary is ${o1.salary}")

    val o2 = o.copy("Bob")
    o2.salary = 40000
    println("details = $o2 and salary is ${o2.salary}")


}