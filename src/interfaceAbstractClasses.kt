
interface Lendable{
    fun borrow()
}

abstract class InventoryItem(open val title:String, open val genre:String, open val PublicationYear:Int):Lendable{
    override fun borrow(){
        print("Borrowed!")
    }
}
class Book(override val title:String,val author: String, override val genre:String, override val PublicationYear:Int):InventoryItem(title,genre, PublicationYear){

}
class DVD(override val title:String, override val genre:String, override val PublicationYear:Int, val length:Int):InventoryItem(title,genre, PublicationYear){

}


fun main() {

}