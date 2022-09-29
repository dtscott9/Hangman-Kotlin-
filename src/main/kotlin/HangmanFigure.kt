class HangmanFigure {

    val hangman = listOf("""
        ----
        |  |
        |  
        | 
        | 
        |
        
        """.trimIndent(),"""
        ----
        |  |
        |  0
        | 
        | 
        |
        
        """.trimIndent(),
        """
        ----
        |  |
        |  0
        |  |
        | 
        |
        
        """.trimIndent(),"""
        ----
        |  |
        |  0
        | /|
        | 
        |
        
        """.trimIndent(),"""
        ----
        |  |
        |  0
        | /|\
        | 
        |
        
        """.trimIndent(),
        """
        ----
        |  |
        |  0
        | /|\
        | / 
        |
        
        """.trimIndent(),
        """
        ----
        |  |
        |  0
        | /|\
        | / \
        |
        
        """.trimIndent())

    fun checkPlayerLives(playerLives:Int)
    {
        if(playerLives == 6)
        {
            println(hangman[0])
        }
        else if(playerLives == 5)
        {
            println(hangman[1])
        }
        else if(playerLives == 4)
        {
            println(hangman[2])
        }
        else if(playerLives == 3)
        {
            println(hangman[3])
        }
        else if(playerLives == 2)
        {
            println(hangman[4])
        }
        else if(playerLives == 1)
        {
            println(hangman[5])
        }

    }
}