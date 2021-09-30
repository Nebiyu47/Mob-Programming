fun main(args:Array<String>){
    val EBook1=EBook("Game of Throwns","George R. R. Martin",4500.6,"p.d.f")
    val Ebook2=EBook("Breaking Bad","Bryan Cranston",3500.8,"P.D.F")
    EBook1.read()
    Ebook2.read()
    EBook1.price=3455.7
    Ebook2.author="Vince Gilligan"
    println("the price of game of throwns ${EBook1.price} and author of breaking bad ${Ebook2.author}")
}