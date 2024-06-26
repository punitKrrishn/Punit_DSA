package Punit_DSA.Arrays;

public class RemoveDuplicates {
    
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int ans = removeDuplicates(nums);
        System.out.println(ans);


    }
    public static int removeDuplicates(int[] nums) {
        int i = 1; // using two pointer
        for(int j=1; j<nums.length; j++) {
            if(nums[j-1] != nums[j]) {
                nums[i] = nums[j];
                i++;
            }
         }
         return i;   
        }
}

// Input: nums = [0,0,1,1,1,2,2,3,3,4]
// Output: 5, nums = [0,1,2,3,4,_,_,_,_,_]
// Explanation: Your function should return k = 5, with the first five elements of nums being 0, 1, 2, 3, and 4 respectively.
// It does not matter what you leave beyond the returned k (hence they are underscores).