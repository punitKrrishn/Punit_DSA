package Punit_DSA.Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindUnion {

    public static void main(String[] args) {

        int arr1[] = { 1, 2, 4, 5, 6 };
        int arr2[] = { 2, 3, 5, 7 };

        // int arr1[] = { 1, 2, 2, 2, 3 };
        // int arr2[] = { 2, 3, 3, 4, 5, 5 };

        int m = arr1.length;
        int n = arr2.length;
        printUnion(arr1, arr2, m, n);
       
        // Function call
        // ArrayList<Integer> uni
        //     = sortedArray(arr1, arr2);
        // for (int i : uni) {
        //     System.out.print(i + " ");
        // }
    }
    
     public static ArrayList<Integer> sortedArray(int[] a, int[] b) {

            Set<Integer> allEleList = new TreeSet<Integer>();


            for(int i : a) {
                allEleList.add(i);
            }
            for(int j: b) {
                allEleList.add(j);

            }
            ArrayList<Integer> myList = new ArrayList<>();
  
            for(int e : allEleList) {
                myList.add(e);
            }

            
        return myList;
    }
    


// Time Complexity: O(m*log(m) + n*log(n)), where ‘m’ and ‘n’ are the size of the arrays
// Auxiliary Space: O(m + n)


// ------------------------Optimal Solution--------------------------

static int printUnion(int arr1[], int arr2[], int m, int n)
{
    int i = 0, j = 0;
    while (i < m && j < n) {
        if (arr1[i] < arr2[j]){
            System.out.print(arr1[i++] + " ");
        }
        else if (arr2[j] < arr1[i]){   // arraylist not equal to zero ||  last ele != next
            System.out.print(arr2[j++] + " ");
        }
        else {                         // arraylist not equal to zero ||  last ele != next
            System.out.print(arr2[j++] + " ");
            i++;
        }
    }

    /* Print remaining elements of 
     the larger array */
    while (i < m)
        System.out.print(arr1[i++] + " ");
    while (j < n)
        System.out.print(arr2[j++] + " ");

    return 0;
} 

// Time Complexity BigO(m+n)

}