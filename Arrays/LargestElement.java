package Punit_DSA.Arrays;

public class LargestElement {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int ans = largestElement(arr, n);
        System.err.println(ans);

    }

        //-------------------------------Brute force solution------------------------------------

    static int indexOfLargestElement(int[] arr) { 
        for(int i=0; i<arr.length; i++) {
            boolean isGreater = true;
            for(int j=0; j<arr.length; j++) {
                if(arr[j] > arr[i]) {
                    isGreater = false;
                    break;
                }
            }
            if(isGreater) {
                return i;
            }
        }
        return -1;
    }
    //-------------------------------Optimal solution------------------------------------

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