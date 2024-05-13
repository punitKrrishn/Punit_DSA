package Punit_DSA.Arrays;

public class StockBuySell {
    
    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int maxPro = maxProfit(arr);
        System.out.println("Max profit is: " + maxPro);
    }
    static int maxProfit(int[] arr) {
        int maxPro = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    maxPro = Math.max(arr[j] - arr[i], maxPro);
                }
            }
        }
        return maxPro;
    }
    class Solution {
        public int maxProfitOptimal(int[] prices) {
            int maxProfit = 0;
            int miniBuy = prices[0];
            int n = prices.length;
            for(int i=1; i<n; i++) {
                int diff = prices[i] - miniBuy;
                maxProfit = Math.max(maxProfit,diff);
                miniBuy = Math.min(miniBuy,prices[i]);
            }
            return maxProfit;
        }
    }
}
