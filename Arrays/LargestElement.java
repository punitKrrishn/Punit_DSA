package Punit_DSA.Arrays;

public class LargestElement {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int ans = largestElement(arr, n);
        System.err.println(ans);

    }

    static int largestElement(int[] arr, int n) {
        int max = arr[0];
        for(int i = 0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        return max;

   }
}

// output = 5;