package problems.easy

import kotlin.math.max
import kotlin.math.min

object MinMaxGame {
    fun minMaxGame(arr: IntArray): Int {
        var nums = arr
        while (nums.size > 1) {
            var newNums = IntArray(nums.size/2)
            for (i in newNums.indices) {
                if (i % 2 == 0) {
                    newNums[i] = min(nums[2 * i], nums[2 * i + 1])
                }
                if (i % 2 != 0) {
                    newNums[i] = max(nums[2 * i], nums[2 * i + 1])
                }
            }
            nums = newNums
        }
        return nums[0]
    }
}