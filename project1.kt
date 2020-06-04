package projectKotlin

lateinit var ans:String     //CONCEPT 1.Late Initialization Concept
fun main() {

    while(1==1) {     //infinite loop
        println("Welcome to PREDICTION ON CARDS game!!")
        println()
        println("********************GAME RULES*********************")
        println("/*")
        println("1.Here you need to do a prediction on cards which you have given.")
        println("2.Cards get shuffled and a card will come for you.")
        println("3.if this card is your chosen card then you win.")
        println("4.In all rest of cases ,you lose this game.")
        println("*/")
        println()
        println()

        val list = listOf<String>("Ace", "King", "Queen", "Jack")
        println("Enter any one card from the cards shown below!!")
        println("Ace  King  Queen  Jack")

        var input: String? = null      //CONCEPT 2.null safety concept
        input = readLine()
        println()
        println("Suffling....")
        var result = getRandom(list)

        if (result == input) {
            println("Congo..you win!!...Result was $result")    //CONCEPT 3.String templates concept
        } else {
            println("you loose!!..Better Luck Next Time..")
            println("Actual result was $result")
        }

        println()
        println("Enter \"Exit\" if you want to exit the game")
        var exit:String?=null
        exit= readLine()
        if(exit=="Exit"){
            break
        }

    }
}

fun getRandom(list:List<String>):String{  //This function choose a random string from list
    ans= list.shuffled().take(1)[0]
    return ans
}
