class Anagram(private val input: String) {

    fun match(candidates: List<String>): Set<String> {
        val cleanedInput = input.toLowerCase().toList().sorted().joinToString("")
        return candidates.filter {
            input.toLowerCase() != it.toLowerCase() && it.toLowerCase().toList().sorted().joinToString("") == cleanedInput
        }.toSet()
    }

}
