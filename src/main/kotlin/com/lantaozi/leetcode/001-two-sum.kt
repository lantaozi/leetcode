package com.lantaozi.leetcode

/**
 * 1. 两数之和
 *
 * 给定一个整数数组 nums和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那两个整数，并返回它们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 *
 * 你可以按任意顺序返回答案。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode.cn/problems/two-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
class Solution {
    /**
     * 正常操作需要O(n2)进行两次遍历。
     *
     * 是可以通过空间换时间，使用哈希表来减少一次遍历。
     */
    fun twoSum(nums: IntArray, target: Int): IntArray? {
        val numberMap = mutableMapOf<Int, Int>()
        nums.forEachIndexed { index, num ->
            val need = target - num
            numberMap[need]?.let { return intArrayOf(index, it) }
            numberMap[num] = index
        }
        return null
    }
}

fun main() {
    val solution = Solution()
    val nums = intArrayOf(-3, 9, 3)
    val target = 0
    val result = solution.twoSum(nums, target)
    println(result?.joinToString())
}