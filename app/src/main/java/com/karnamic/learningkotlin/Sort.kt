package com.karnamic.learningkotlin

object Sort {

    fun usingInsertionSort(inputArrayList: ArrayList<Double>) {
        val arraySize = inputArrayList.size

        for (i in 1..<arraySize){
            var j = i-1
            while (j >=0 && inputArrayList[j] > inputArrayList[j+1]) {
                val temp = inputArrayList[j+1]
                inputArrayList[j+1] = inputArrayList[j]
                inputArrayList[j] = temp
                j--
            }
        }
    }

    fun usingMergeSort(inputArrayList: ArrayList<Double>, start: Int = 0, end: Int = inputArrayList.size) {
        if (end - start > 1){
            val middle = (end + start) / 2
            usingMergeSort(inputArrayList, start, middle)
            usingMergeSort(inputArrayList, middle, end)
            mergeInPlace(inputArrayList, start, middle, end)
        }
    }

    fun usingQuickSort() {

    }

    fun usingBucketSort() {

    }

    private fun mergeInPlace(input: ArrayList<Double>, start: Int, middle: Int, end: Int) {
        var leftIndex = start
        var rightIndex = end

        while (leftIndex < middle) {}
    }

}