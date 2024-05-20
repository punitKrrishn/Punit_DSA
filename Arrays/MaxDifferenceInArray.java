package Punit_DSA.Arrays;

public class MaxDifferenceInArray {
    public static void main(String[] args) {
        int[] arr = {2,3,10,6,4,8,1}; // output 8
        int ans = maxDiff(arr);
        System.out.println(ans);

    }
    //--------------------Brute force T.C=O(n^2)-------------------------------
    public static int maxDiff(int[] arr) {
        int res = arr[1]-arr[0];
        for(int i=0; i<arr.length-1; i++) {
            for(int j = i+1; j<arr.length; j++) {
                res = Math.max(res, arr[j]-arr[i]);
            }
        }
        return res;
    }
}
