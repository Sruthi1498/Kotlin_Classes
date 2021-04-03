class Registration(name: String, id:Int, salary:Double) {
    var name = name
    var id = id
    var salary = salary
        get() = field
        set(value) { field = value }

    fun get(): String{
            return name + " " + id + " "+ salary
        }

}
fun main()
{
    val r = Registration("Alice",123,4500.32)
    println(r.get())

    println(r.name)
    println(r.id)
    println(r.salary)
}