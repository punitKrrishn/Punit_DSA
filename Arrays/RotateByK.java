package Punit_DSA.Arrays;

public class RotateByK {
    
    public static void main(String[] args) {
        
        int[] nums = {1,2,3,4,5};
        int k = 2;
        // for(int i=0; i<k; i++) {
        //     rotatebyOne(nums);
        // }
        rotateByK(nums, k);
        printArray(nums);
    }
    // Optimal Solution
    public static void rotateByK(int[] nums, int k) {

        k = k % nums.length;   // find reminder of k divided by nums.length because k is more than nums.length we don't need to iterate huge iterations.
        reverse(nums,0,nums.length-1);  // first of all reverse entire the array.
        reverse(nums,0,k-1);   // reverse the array from 0th index to k-1 index.
        reverse(nums,k,nums.length-1);   // reverse the array from kth index to araay.length-1 index.


    }
    static void reverse(int[] nums,int i,int j){   // Create a reverse function to reverse array from ith position to jth position.
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }
    static void swap(int[] nums,int i,int j){   // Create a swap function to swap to array elements.
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Time Limit Exceeded
    public static void rotatebyOne(int[] nums) {
        int n = nums.length;
        int lastElement = nums[n-1];

        for(int i=n-1; i>0; i--) {
           nums[i] = nums[i-1];
        }
        nums[0] = lastElement;
    }
    static void printArray(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
