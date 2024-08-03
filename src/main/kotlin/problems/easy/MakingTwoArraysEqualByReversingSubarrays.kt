package problems.easy

object MakingTwoArraysEqualByReversingSubarrays {
    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        val target = target.sortedArray()
        val arr = arr.sortedArray()
        for (i in arr.indices) {
            if (arr[i] != target[i]) {
                return false
            }
        }
        return true
    }
}