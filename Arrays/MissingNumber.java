package Punit_DSA.Arrays;

public class MissingNumber {
    
    public static void main(String[] args) {
     
        int[] arr = {9,6,4,2,3,5,7,0,1};
        int ans = missingNumber(arr);
        System.out.println(ans);
    }

    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2;
        for(int ele : nums) {
            sum -= ele;
        }
        return sum;
    }
 
    // LeetCode Problem
    // Input: nums = [9,6,4,2,3,5,7,0,1]
    // Output: 8
    // Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
}
