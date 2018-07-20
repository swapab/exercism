class Year(var year: Int) {
    val isLeap: Boolean by lazy { (isDivisibleBy(4) && !isDivisibleBy(100)) || isDivisibleBy(400) }

    private fun isDivisibleBy(int: Int) =
            year.rem(int) == 0
}
