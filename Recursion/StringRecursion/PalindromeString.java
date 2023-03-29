package Recursion.StringRecursion;

public class PalindromeString {
    public static void main(String[] args) {
        String str = "naman";
        boolean x = isPalindrome(str, 0, 0);
        System.out.println(x);
    }

    public static boolean isPalindrome(String str, int l, int r){

        if (l >= r) return true;

        if (str.charAt(l) != str.charAt(r)){
            return false;
        }

        return isPalindrome(str, (l+1), (r+1));
    }
}
