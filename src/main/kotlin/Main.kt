fun main(args: Array<String>) {

    var playerLives:Int = 6
    var word = Word()
    word.GenRandomWord()
    var wordToGuess = word._wordToGuess
    var terminal = Terminal()
    terminal.createWordToGuess(wordToGuess)
    var hangman = HangmanFigure()

    fun GameLost()
    {
        println(hangman.hangman[6])
        println("Game Over")
        println("The word was: $wordToGuess")
    }

    fun GameWon()
    {
        println(wordToGuess)
        println("Congratulation you Won!")
    }

    while (terminal.dashedWord.contains('_'))
    {
//        println(wordToGuess)
        hangman.checkPlayerLives(playerLives)
        println(terminal.dashedWord)
        terminal.checkUserGuess(wordToGuess)

        if (!terminal.status)
        {
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
