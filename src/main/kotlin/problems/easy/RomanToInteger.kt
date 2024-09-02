package problems.easy

object RomanToInteger {
    fun solution(s: String): Int {
        val romanMap = mapOf(
            "I" to 1,
            "V" to 5,
            "X" to 10,
            "L" to 50,
            "C" to 100,
            "D" to 500,
            "M" to 1000
        )
        var ans =0
        for(i in s.indices){
            if((i < (s.length - 1)) && (romanMap.getValue(s[i].toString()) < romanMap.getValue(s[i + 1].toString()))){
                ans -= romanMap.getValue(s[i].toString())
            }else{
                ans += romanMap.getValue(s[i].toString())
            }
        }
        return ans
    }
}
