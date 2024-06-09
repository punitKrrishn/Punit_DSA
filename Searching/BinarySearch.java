package Punit_DSA.Searching;

class BinarySearch {
    
    public static void main(String[] args) {
        
        int[] a = {3, 4, 6, 7, 9, 12, 16, 17};
        int target = 6;
        //int ind = binarySearch(a, target);
        int ind = search(a, target);
        if (ind == -1)
            System.out.println("The target is not present.");
        else
            System.out.println("The target is at index: " + ind);

    }

    public static int binarySearch(int[] nums, int target) {
        int n = nums.length; //size of the array.
        int low = 0, high = n - 1;

        // Perform the steps:
        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] == target) return mid;
            else if (target > nums[mid]) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }

    //-------------------------Optimal Approach--------------------------

    public static int binarySearchOptimal(int[] nums, int low, int high, int target) {
        if (low > high) return -1; //Base case.

        // Perform the steps:
        int mid = (low + high) / 2;
        if (nums[mid] == target) return mid;
        else if (target > nums[mid])
            return binarySearchOptimal(nums, mid + 1, high, target);
        return binarySearchOptimal(nums, low, mid - 1, target);
    }

    public static int search(int[] nums, int target) {
        return binarySearchOptimal(nums, 0, nums.length - 1, target);
    }

    
}