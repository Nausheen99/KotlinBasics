open class Player (val name: String, var age : Int, val gender: String)
{
    fun attack(){
        println("Player initiate attack")
    }

    open fun defend(){
        println("Player is defending")
    }

    fun walk(){
        println("Player is walking")
    }
}

class Thief(name: String, age: Int, gender: String) : Player(name,age,gender){
    override fun defend(){
        println("Thief is defending")
    }
}

class Warrior(name: String, age: Int, gender: String) : Player(name,age,gender) {


}

    fun main() {
    var man = Thief("experimentX",22, "Female")
    man.defend()
}