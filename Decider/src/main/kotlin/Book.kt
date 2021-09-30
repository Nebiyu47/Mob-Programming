open class Book {
     var title :String
     var author: String
     var price : Double=0.0
    constructor(title:String,author:String,price:Double){
        this.author=author
        this.title=title
        this.price=price


    }

    open fun read(){
        println("RReading Paper book”")
    }
}