package com.karnamic.learningkotlin

object SlidingWindow {

    /**
     * Given an array of stock prices where prices[i] is the price of a given stock on the ith day,
     * this function calculates the maximum profit that can be achieved by buying and selling the stock.
     *
     * The goal is to maximize profit by choosing a single day to buy the stock and a different day
     * in the future to sell that stock. If no profit can be achieved, 0 is returned.
     *
     * @param prices The array of stock prices.
     * @return The maximum profit achievable from the stock transaction.
     */
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var left = 0
        var right = 1


        while (right < prices.size) {
            if (prices[left] > prices[right]){
                maxProfit = maxOf(maxProfit, prices[left] - prices[right])
            } else {
                left = right
            }
            right++
        }


        return maxProfit
    }

}