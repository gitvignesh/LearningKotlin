package com.karnamic.learningkotlin

object ArraysHashing {


    /**
     * Given an integer array [nums], this function checks if any value appears at least twice in the array.
     *
     * Returns `true` if there are duplicate values, and `false` if every element is distinct.
     *
     * @param nums The input array of integers to check for duplicates.
     * @return `true` if there are duplicate values, `false` otherwise.
     */
    fun containsDuplicate(nums: IntArray): Boolean {
        val hashSet = hashSetOf<Int>()

        for (num in nums) {
            if (hashSet.contains(num)) {
                return true
            } else {
                hashSet.add(num)
            }
        }
        return false
    }

}