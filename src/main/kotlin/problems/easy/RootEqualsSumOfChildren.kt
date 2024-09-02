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
    fun checkTree(root: TreeNode?): Boolean {
        // Ensure the root is not null and both children exist
        if (root?.left == null || root.right == null) {
            return false
        }

        // Check if the value of the root is equal to the sum of its children's values
        return root.value == (root.left?.value ?: 0) + (root.right?.value ?: 0)
    }
}