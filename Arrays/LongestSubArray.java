package Punit_DSA.Arrays;

public class LongestSubArray {
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 1, 1, 1};
        int k = 3;
        int res = getLongestSubarrayWithGivenSum(arr, k);
        System.out.println(res);

    }

    public static int longestSubArrayWithGivenSum(int[] arr, int key) {


        int longest = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                // For loop to print subarray elements
                int sum = 0;
                for (int k = i; k <=j; k++){
                    sum += arr[k]; 
                }
                if(sum == key) {
                    longest = Math.max(longest, (j-i)+1);   
                }
          }
        }
        return longest;
    }
    //---------------Solution - 2 -----------------------------
    public static int getLongestSubarray(int []a, long k) {
        int n = a.length; // size of the array.

        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            long s = 0; // Sum variable
            for (int j = i; j < n; j++) { // ending index
                // add the current element to
                // the subarray a[i...j-1]:
                s += a[j];

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }
    //--------------Using Two Pointer-------------------------------
    public static int getLongestSubarrayWithGivenSum(int []a, long k) {
        int n = a.length; // size of the array.

        int left = 0, right = 0; // 2 pointers
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
            // if sum > k, reduce the subarray from left
            // until sum becomes less or equal to k:
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

            // if sum = k, update the maxLen i.e. answer:
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }

            // Move forward thw right pointer:
            right++;
            if (right < n) sum += a[right];
        }

        return maxLen;
    }
    public static void PrintAllSubArrays(int[] arr) {

        for(int i=0; i<arr.length; i++) {
            for(int j=i; j<arr.length; j++) {
                // For loop to print subarray elements
                for (int k = i; k <=j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println(""); 
          }
        }
    }
}
