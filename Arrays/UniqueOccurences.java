package Punit_DSA.Arrays;

import java.util.HashMap;
import java.util.HashSet;

public class UniqueOccurences {
    public static void main(String[] args) {
        int arr[] = {1,2,2,1,1,3}; // output : true all elements have unique occurence in array
        boolean ans = UniqueOcc(arr);
        System.out.println(ans);
    }
    //--------------------Better Solution using hashmap & hashset-------------------
    public static boolean UniqueOcc(int[] arr) {

        HashMap<Integer,Integer> num_occourences = new HashMap<>();
        for(int num : arr) {
            num_occourences.put(num, num_occourences.getOrDefault(num, 0)+1);
        }
        HashSet<Integer> uniqueValues = new HashSet<>(num_occourences.values());
        return num_occourences.size() == uniqueValues.size();
    }
}
