package problems.easy

/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */

class TreeNode(var value: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

object RootEqualsSumOfChildren {
    fun solution(root: TreeNode?): Boolean {
        if ((root == null) || (root.left == null) || (root.right == null)) {
            return false
        }
        return root.value == (root.left?.value ?: 0) + (root.right?.value ?: 0)
    }
}