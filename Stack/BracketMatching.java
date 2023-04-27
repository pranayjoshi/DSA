package Stack;

import java.util.Stack;

public class BracketMatching {

    public static String A = "((({})))";

    public static Stack<Character> s = new Stack<>();
    public static void main(String[] args) {
        boolean r = Match();
        if (r){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

    public static boolean Match(){

        for ( int i = 0; i < A.length() ; i++){

            char curr = A.charAt(i);

            if (isOpening(curr)){
                s.push(curr);
            }
            else {
                if (s.isEmpty()){
                    return false;
                } else if (!isMatching(s.peek(), curr)){
                    
                    return false;
                } else {
                    s.pop();
                }
            }
            

        }
        return s.isEmpty();
    }

    static boolean isOpening( char a) {
        return a =='(' || a == '{' || a == '[';
    }

    static boolean isMatching( char a, char b) {
        // System.out.println(a);
        // System.out.println(b);
        // if ((a == '{' && b == '}')){
        //     System.out.println("cool");
        // } else {
        //     System.out.println("not cool");
        // }
        return (a == '(' && b == ')') || (a == '{' && b == '}') || (a == '[' && b == ']');
    }
}
