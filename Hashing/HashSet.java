

package Hashing;

public class HashSet {
    public static void main(String[] args) {
        java.util.HashSet<Integer> s = new java.util.HashSet<>();
        s.add(5);
        s.add(10);
        System.out.print(s);
        if (s.contains(10)){
            System.out.println("Present");
        } else {
            System.out.println("no");
        }
        s.remove(10);
    }
}
