class Show(val name:String)
{
    override fun toString(): String {
        return name
    }
}
fun main()
{
    fun Show?.output(){
        if(this == null)
            println("null")
        else
            println(this.toString())
    }
    val o = Show("alice")
    o.output()
    null.output()
}