package Punit_DSA.Arrays;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {6,7,8,4,1};
        int num = 4;
        int index = linearSearch(num, arr);
        System.out.println(index);
    }
    
    public static int linearSearch(int num, int []arr){
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == num) {
                return i;
            }
        }
        return -1;
    }
}
