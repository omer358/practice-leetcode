package problems.easy

object MakingTwoArraysEqualByReversingSubarrays {
    fun canBeEqual(target: IntArray, arr: IntArray): Boolean {
        if(checkSameElements(target,arr)){
         return reversRequireElements(target,arr)
        }
        println("arr does not hold the same elements in target")
        return false
    }

    private fun reversRequireElements(target: IntArray, arr: IntArray): Boolean {
        return true
    }

    private fun checkSameElements(target: IntArray, arr: IntArray): Boolean {
        for (element in target){
            if (arr.contains(element)){
                println("$element is exist in arr")
                continue
            }else{
                println("$element is not exist in arr")
                return false
            }
        }
        println("All elements in target are exist in arr")
        return true
    }
}