fun main()
{
    fun Int.abs() : Int{
        return if(this<0) -this
        else this
    }

    println((-7).abs())
    println((7).abs())
}