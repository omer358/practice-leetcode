import problems.easy.RootEqualsSumOfChildren
import problems.easy.TreeNode

fun main() {
    val root = TreeNode(10).apply {
        left = TreeNode(4)
        right = TreeNode(6)
    }

    println(RootEqualsSumOfChildren.checkTree(root))
}