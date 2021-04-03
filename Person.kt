interface Person {
    fun show()
    fun display()
}
class Abc: Person
{
    override fun show() {
        println("Inside show function")
    }

    override fun display() {
        println("Inside dsplay function")
    }
}
fun main()
{
    var obj = Abc()
    obj.display()
    obj.show()
}