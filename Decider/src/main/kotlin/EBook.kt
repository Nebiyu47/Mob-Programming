class EBook: Book {
    val filetype: String

    constructor(title: String, author: String, price: Double, filetype: String) :
            super(title, author, price) {
              this.filetype = filetype;
    }
    override fun read() {
        println("Read from Electronic Device")
    }

}
