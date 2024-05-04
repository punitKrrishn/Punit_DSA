package Punit_DSA.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        printArray(nums);
    }

    public static void moveZeroes(int[] nums) {
        
        int j=0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0 && nums[j] == 0) {
                //swap
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;                
            }
            if(nums[j] !=0) {
                j++;
            }
        }
    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
