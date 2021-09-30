import java.util.*

fun main(args:Array<String>){
    val number: Array<Int> = arrayOf(1,2,3,4,6,5)
    var oddNumbers: List<Int> = number.filter { x: Int -> x % 2 !=0}
     var squarofOdd: List<Int> = oddNumbers.map { n: Int ->n*n }
     println(squarofOdd)
    var sum=squarofOdd.sum()
    println(sum)


}