package Punit_DSA.Arrays;

public class FIndSingleElement {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4};
        int res = getSingleElement(arr);
        System.out.println(res);
    }

    public static int getSingleElement(int []arr){
        int xror = 0;
        for(int i=0; i<arr.length; i++) {
            xror = arr[i] ^ xror;
        }
        return xror;
    }
    
}
