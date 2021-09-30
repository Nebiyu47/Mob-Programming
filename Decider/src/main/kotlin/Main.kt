import java.util.*

fun main(args:Array<String>) {
    var read=Scanner(System.`in`)
    var number=read.nextInt();
    var LastDigit=number%10
    var firstDigit=number
    while(firstDigit>=10){
        firstDigit=firstDigit/10
    }
    println("First Digit $firstDigit Last Digit $LastDigit")
}