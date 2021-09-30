fun main(args:Array<String>){
    val Book1=Book("Star Wars","George Lucas",23333.5)
     Book1.read()
    val Book2=Book("Bat Man the Dark Night","Bob Kane",34444.6)
    Book2.read()
    Book2.price=345.77
    Book1.author="Bill Finger"
    println("${Book1.author} the price for Book 2 ${Book2.price} CHANGING")
}