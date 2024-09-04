import problems.easy.MostFrequentEven
import problems.easy.TreeNode

fun main() {
    val root = TreeNode(10).apply {
        left = TreeNode(4)
        right = TreeNode(6)
    }

    println(MostFrequentEven.solution(intArrayOf(0,1,2,2,4,4,1)))
}