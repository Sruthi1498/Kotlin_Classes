fun interface Lambda
{
    fun isEven(i:Int):Boolean
}
val i = Lambda { it %2 == 0 }
fun main()
{
    println("the number is even = ${i.isEven(56)}")
}