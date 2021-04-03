
open class A(val a:Int, val b:Int){
}


class B():A(5, 5){}

fun main(){


    fun A.operate():Int{
        return a+b
    }


    fun B.operate():Int{
        return a*b;
    }


    fun display(a: A,b: B){
        println(a.operate())
        println(b.operate())
    }

    display(B(),B())
}
