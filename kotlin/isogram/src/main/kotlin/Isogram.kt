class Isogram {

    companion object {
        fun isIsogram(input: String): Boolean {
            val cleanedInput = input.replace("[^A-Za-z]".toRegex(), "").toLowerCase()
            return cleanedInput.toSortedSet().size == cleanedInput.count()
        }
    }
}
