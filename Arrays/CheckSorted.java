package Punit_DSA.Arrays;

public class CheckSorted {

    public static void main(String[] args) {
     
        int[] arr = {3,4,5,1,2};
        boolean ans = check(arr);
        System.err.println(ans);
    }    


public static boolean check(int[] nums) {
    int count = 0;
    int n = nums.length;
    for(int i=1; i<nums.length; i++) {
        if(nums[i-1] > nums[i]) {
            count++;
        }
    }
    if(nums[n-1] > nums[0]) {
        count++;
    }

    return count<=1;
 }
}

// Output : true