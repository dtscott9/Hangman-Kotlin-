import java.util.Scanner

class Terminal {

    public var playerGuess:Char = 'Q'

    public var status:Boolean = false

    public var dashedWord:CharArray = charArrayOf()

    public fun checkUserGuess(correctWord:String) {
        val scanner = Scanner(System.`in`)
        println("Guess a letter")
        playerGuess = scanner.next().single()
        println("Your letter is $playerGuess")
        var correctIndex = correctWord.indexOf(playerGuess)

        if (correctWord.contains(playerGuess)) {

            while (correctIndex >= 0)
            {
                dashedWord.set(correctIndex, playerGuess)
                correctIndex = correctWord.indexOf(playerGuess, correctIndex + 1)
                println("That is correct")
                status = true
            }
        }

        else
        {
            println("That is incorrect")
            status = false
        }



    }
    public fun createWordToGuess(correctWord: String): CharArray {
        dashedWord = correctWord.toCharArray()

        val wordCount = dashedWord.count()
        var index:Int = 0

        while (index < wordCount)
        {
          dashedWord.set(index, '_')
            index += 1
        }

        return dashedWord

    }
}