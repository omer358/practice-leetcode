package problems.easy

object RomanToInteger {
    fun romanToInt(s: String): Int {
        val romanMap = mapOf(
            "I" to 1,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000
        )
        val specialCases = mapOf(
            "IV" to 4,
            "IX" to 9,
            "XL" to 40,
            "XC" to 90,
            "CD" to 400,
            "CM" to 900
        )
        var counter = 0
        var i = 0
        while (i < s.length) {
            val currentElement = s[i].toString()
            val nextElement = if (i + 1 < s.length) s[i + 1].toString() else null

            if (nextElement != null && (currentElement + nextElement) in specialCases) {
                counter += specialCases.getValue(currentElement + nextElement)
                i += 2 // Skip the next element as it's already considered
            } else {
                counter += romanMap.getValue(currentElement)
                i++
            }
        }
        return counter
    }
}
