package hang

fun main() {
    println("Enter word to guess")
    val word = readLine()
    if (word == null)
    {
        println("No word given")
        return
    }

    /*for (i in 1..30){
        println()
    }*/

    val letters = word.lowercase().toCharArray().toHashSet()
    val correctguesses = mutableSetOf<Char>()
    var failures = 0
    var tries : Int = 10

    var guessed: Boolean = false

    while (tries >= 0)
    {
        work(word,correctguesses)
        println()
        println("Tries left: $tries")
        println("Guess letter: ")
        val guess = readLine()

        if(guess == null) {
            continue
        } else if (guess.length !=1) {
            println("Please enter one letter")
        }
        if(word.lowercase().contains(guess.lowercase())) {
            correctguesses.add(guess[0])
        } else {
            failures++
        }
        tries--

        if (letters == correctguesses){
            guessed = true
            break
        }


    }
    //work(word,correctguesses)
    //work("wordle", mutableSetOf('o','e'))

    if (guessed){
        println("COngratssss")
    }
    else{
//        println()poiuyt

        println("You didnt guessed\nWrong guesses $failures")
//        println("You Win!")
    }


}

fun work(word:String, correctguesses: Set<Char>)
{
    for (f in word.lowercase()){
        if (correctguesses.contains(f)){
            print(f + " ")
        }else {
        print("_ ")}
        //println()
    }

}