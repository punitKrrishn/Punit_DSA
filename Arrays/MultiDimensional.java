package Punit_DSA.Arrays;

import java.util.Arrays;

public class MultiDimensional {

    public static void main(String[] args) {
     int[][] arr = {{1,11,111},{2,22,222},{3,33,333}};
     singleLinePrint(arr);
    }

    public static void printArray(int[][] arr) {

        for(int row = 0; row < arr.length; row++) {
            for(int col = 0; col<arr[row].length;  col++) { // USe this Even col no is fixed
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void singleLinePrint(int[][] arr){

        for(int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }



}