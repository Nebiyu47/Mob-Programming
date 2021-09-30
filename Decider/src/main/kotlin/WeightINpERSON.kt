import java.util.*

fun main(args:Array<String>){
    var read=Scanner(System.`in`)
    var weight=read.nextFloat();
    val operator= readLine()
    val result= when (operator){
        "Venus"-> weight*0.78
        "Mars" -> weight*0.39
        "Jupiter"->weight*2.65
        "Saturn"->weight*1.17
        "Uranus"->weight*1.05
        "Neptune"->weight*1.23
        else-> "$operator operator is not vaild"
    }

    println("result $result")

}