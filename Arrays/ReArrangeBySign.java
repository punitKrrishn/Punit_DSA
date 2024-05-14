package Punit_DSA.Arrays;

import java.util.ArrayList;

public class ReArrangeBySign {
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        int[] ans = rearrangeArray(arr);
        printArray(ans);

    }

    //--------------------Better Solution T.C = O(n) and S.C = O(3n)----------------------------
     public static int[] rearrangeArray(int[] nums) {
        ArrayList<Integer> posArray = new ArrayList<>();
        ArrayList<Integer> negArray = new ArrayList<>();
        ArrayList<Integer> resArray = new ArrayList<>();
        for(int pos : nums) {
            if(pos > 0) {
                posArray.add(pos);
            }
        }
         for(int neg : nums) {
            if(neg < 0) {
                negArray.add(neg);
            }
        }
        for(int i=0; i<posArray.size(); i++) {
            resArray.add(posArray.get(i));
            resArray.add(negArray.get(i));
        }
        return resArray.stream().mapToInt(Integer::intValue).toArray();

    }

    
    static void printArray(int[] arr) {
        int n = arr.length;
        for(int i=0; i<n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    
}
