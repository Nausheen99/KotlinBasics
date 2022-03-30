abstract class Human(open val name:String, open var age: Int){
    abstract fun say()

}

class Student(override val name : String, override var age: Int):Human(name,age){
    override fun say(){
        println("I am stoodent")
    }
}

class Instructor(override val name : String, override var age: Int):Human(name,age){
    override fun say(){
        println("I am instrooctor")
    }
}

fun main() {
    //val moo=Human("hooman", 0)
    val noo=Student("ME",22)
    val boo=Instructor("YOU",44)
    //moo.say()
    noo.say()
    boo.say()




}