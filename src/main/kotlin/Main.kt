import problems.easy.TreeNode
import problems.easy.ValidParentheses

fun main() {
    val root = TreeNode(10).apply {
        left = TreeNode(4)
        right = TreeNode(6)
    }

    println(ValidParentheses.solution("("))
}