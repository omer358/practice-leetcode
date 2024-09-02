package problems.easy

object MakingTwoArraysEqualByReversingSubarrays {
    fun solution(target: IntArray, arr: IntArray): Boolean {
        val target = target.sortedArray()
        val arr = arr.sortedArray()
        for (i in arr.indices) {
            if (arr[i] != target[i]) {
                return false
            }
        }
        return true
    }

    fun solutionUsingMap(target: IntArray, arr: IntArray): Boolean {
        val targetMap = mutableMapOf<Int, Int>()
        for (i in target) {
            if (targetMap.containsKey(i)) {
                targetMap[i] = targetMap.getOrDefault(i, 0) + 1
            } else {
                targetMap[i] = 1
            }
        }

        val arrMap = mutableMapOf<Int, Int>()

        for (i in arr) {
            if (arrMap.containsKey(i)) {
                arrMap[i] = arrMap.getOrDefault(i, 0) + 1
            }else{
                arrMap[i] = 1
            }
        }
        println("arrMap: $arrMap")
        if (arrMap.keys.size != arrMap.keys.size) {
            return false
        }
        for (num in arrMap.keys) {
            if (arrMap.getOrDefault(num, 0) != targetMap.getOrDefault(num, 0)) {
                return false
            }
        }
        return true
    }
}