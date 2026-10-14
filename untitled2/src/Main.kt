fun main(){
    val result = add(4,5)
    println(result)
    evenOrodd( 112)
}

fun add(num1: Int, num2: Int): Int
{
    val sum = num1 + num2
    return sum
}
fun evenOrodd(num1: Int){
    val result = if(num1%2==0) "Even" else "Odd"
    println(result)
}