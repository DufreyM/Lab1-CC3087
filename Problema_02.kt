fun main() {
    println("Ingresa varias palabras separadas por espacios:")
    val input = readLine()!!
    val words = input.split(" ")

    var palindromeCount = 0
    var wordsWithTwoVowels = 0
    var wordsStartingWithConsonant = 0

    for (word in words) {
        if (isPalindrome(word)) {
            palindromeCount++
        }
        if (hasAtLeastTwoDifferentVowels(word)) {
            wordsWithTwoVowels++
        }
        if (startsWithConsonant(word)) {
            wordsStartingWithConsonant++
        }
    }

    println("Cantidad de palabras palíndromas: $palindromeCount")
    println("Cantidad de palabras con al menos 2 vocales distintas: $wordsWithTwoVowels")
    println("Cantidad de palabras que inician con una letra consonante: $wordsStartingWithConsonant")
}

fun isPalindrome(word: String): Boolean {
    val cleanWord = word.toLowerCase().replace("\\s".toRegex(), "")
    return cleanWord == cleanWord.reversed()
}

fun hasAtLeastTwoDifferentVowels(word: String): Boolean {
    val vowels = "aeiou"
    val foundVowels = mutableSetOf<Char>()
    for (char in word.toLowerCase()) {
        if (char in vowels) {
            foundVowels.add(char)
        }
        if (foundVowels.size >= 2) {
            return true
        }
    }
    return false
}

fun startsWithConsonant(word: String): Boolean {
    val consonants = "bcdfghjklmnpqrstvwxyz"
    return word.isNotEmpty() && word[0].toLowerCase() in consonants
}
