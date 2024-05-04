package Punit_DSA.Arrays;

public class SecondLargest {
    
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5};
        int n = arr.length;
        int[] ans = getSecondOrderElements(arr,n);
        System.out.println(" "+ans[0]+" "+ans[1]);

    }

    public static int[] getSecondOrderElements(int[] a, int n) {
        
        int secondLargest = Integer.MIN_VALUE;
        int max = Integer.MIN_VALUE;

        int secondSmallest = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i=0; i<a.length; i++) {
            if(a[i] > max ) {
                secondLargest = max;
                max = a[i];
            }else if(a[i] > secondLargest && a[i] != max) {
                 secondLargest = a[i];
            }
        }

         for(int i=0; i<a.length; i++) {
            if(a[i] < min ) {
                secondSmallest = min;
                min = a[i];
            }else if(a[i] < secondSmallest && a[i] != min) {
                 secondSmallest = a[i];
            }
        }

         return new int[]{secondLargest,secondSmallest};

 } 
}

// Input: ‘n’ = 5, ‘a’ = [1, 2, 3, 4, 5]
// Output: [4, 2]

// The second largest element after 5 is 4, and the second smallest element after 1 is 2.