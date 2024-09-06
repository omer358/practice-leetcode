package problems.easy

object ValidParentheses {
    fun solution(s: String): Boolean {
        val stack = mutableListOf<Char>()
        val closeToOpen = mapOf(
            ')' to '(',
            '}' to '{',
            ']' to '['
        )
        for (bracket in s) {
            if (bracket in closeToOpen.values) {
                stack.add(bracket)
            } else if (bracket in closeToOpen.keys) {
                if (stack.isEmpty() ||
                    stack.removeAt(stack.size - 1)
                    != closeToOpen[bracket]
                ) return false
            }
        }
        return stack.isEmpty()
    }
}