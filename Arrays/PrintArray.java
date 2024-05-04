package Punit_DSA.Arrays;

public class PrintArray {

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};
       // int[] arr = new int[size];
       // int arr[] = new int[size];
       printArray(arr);

    }

    static void printArray(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
}
// output : 1 2 3 4 5 