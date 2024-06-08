package Punit_DSA.Strings;

public class CheckPalindrome {

    public static void main(String[] args) {
        String str = "MAM";
        Boolean ans = isPalin(str);
        System.out.println(""+ans);
    }

    public static boolean isPalin(String str) {
        int i = 0;
        int j = str.length()-1;
        while(i<j) {
            if(str.charAt(i) != str.charAt(j)) {
                return false;
            }else {
                i++;
                j--;
            }
        }
        return true;
    }
    
}
