package Recursion.StringRecursion.Recursion.String;

public class SubsetString {
    public static void main(String[] args) {
        PowerSet("Hello", 0, "");
    }
    public static void PowerSet(String s, int i, String cur){
        if (i == s.length()){
            System.out.println(cur);
            return;
        }

        PowerSet(s, i+1, cur + s.charAt(i));
        PowerSet(s, i+1, cur);
    }
}
