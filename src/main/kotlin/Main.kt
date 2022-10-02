fun main(args: Array<String>) {

    var playerLives:Int = 6
    var word = Word()
    word.GenRandomWord()
    var wordToGuess = word._wordToGuess
    var terminal = Terminal()
    terminal.createWordToGuess(wordToGuess)
    var hangman = HangmanFigure()
    var gameStatus:Boolean = true

    //Displays Game Over screen
    fun GameLost()
    {
        println(hangman.hangman[6])
        println("Game Over")
        println("The word was: $wordToGuess")
    }

    //Displays win screen
    fun GameWon()
    {
        println(wordToGuess)
        println("Congratulation you Won!")
    }

    //Checks to see if the word still contains underscores
    fun Isplaying() {
        while (terminal.dashedWord.contains('_')) {
//        println(wordToGuess)
            hangman.checkPlayerLives(playerLives)
            println(terminal.dashedWord)
            terminal.checkUserGuess(wordToGuess)

            if (!terminal.status) {
                if (playerLives >= 2) {
                    playerLives -= 1
                } else {
                    GameLost()
                    break
                }
            }
        }
        if (terminal.status)
        {
            GameWon()
        }
    }

    //This will start the game and then ask the player if they want to replay after the game is over
fun StartGame()
{
    while(gameStatus)
    {
        Isplaying()
        println("Would you like to play again? Y/N")
        var userChoice = readln()
        if(userChoice.lowercase() == "n")
        {
            gameStatus = false
        }
        else
        {
            word.GenRandomWord()
            wordToGuess = word._wordToGuess
            playerLives = 6
            terminal.createWordToGuess(wordToGuess)
        }
    }
}

StartGame()

}
