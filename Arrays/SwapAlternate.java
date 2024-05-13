package Punit_DSA.Arrays;

public class SwapAlternate {
    public static void main(String[] args) {
        int[] arr = {5,2,9,4,7,6,1,0};
        printArray(arr);
        swapAlt(arr);
        printArray(arr);
    }

    public static void swapAlt(int[] arr) {
        for(int i=0; i<arr.length; i+=2) {
            if(i+1 < arr.length) {
                swap(arr,i,i+1);
            }
        }
    }

    public static void swap(int[] arr,int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void printArray(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
