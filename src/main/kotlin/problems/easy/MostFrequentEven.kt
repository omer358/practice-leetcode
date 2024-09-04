package problems.easy

object MostFrequentEven {
    fun solution(nums: IntArray): Int {
        val evenElements = nums.filter{it%2 == 0}
        val evenMap = evenElements.associateWith { key ->
            evenElements.count{
                key == it
            }
        }
        val maxValue = evenMap.maxByOrNull { it.value }?.value
        return evenMap.filter { it.value == maxValue }
            .minByOrNull { it.key }
            ?.key ?: -1
    }
}