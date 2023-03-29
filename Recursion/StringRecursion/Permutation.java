package Recursion.StringRecursion;

public class Permutation {
    public static void main(String[] args) {
        Perm("Hello", 0, 4);
    }
    public static String Swap(String s, int l, int r){
        StringBuilder sb = new StringBuilder(s);
        sb.setCharAt(l, s.charAt(r));
        sb.setCharAt(r, s.charAt(l));
        return sb.toString();
    }
    public static void Perm(String s, int l, int r){
        if (l == r){
            System.out.println(s);
            return;
        }
        for (int i = l; i <=r; i++){
            s = Swap(s, l, i);
            Perm(s, l+1, r);
            s = Swap(s, l, i);
        }
        
    }
}
