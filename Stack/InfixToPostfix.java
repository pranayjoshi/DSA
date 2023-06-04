package Stack;

import java.util.Stack;

import javax.swing.text.html.parser.Element;

public class InfixToPostfix {

    public static String infix = "a + (b + c) / d";

    public static Stack<Character> St = new Stack<>();

    public static void main(String[] args){
        String x = infix.replaceAll("\\s", "");
        for (int i = 0; i < x.length(); i++) {
            
            char element = x.charAt(i);
            if (!St.empty()){
                if ( isOperator(St.peek()) && isOperator(element)){
                    if (isHigherPrecedence(St.peek(), element)){
                        System.out.println(St.pop());

                    }
                    St.push(element);
                }
            } else {
                if (isOperator(element)){
                    St.push(element);
                }
            }
            if (isOpeningBracket(element)){
                St.push(element);
            }
            
        }
    }

    static boolean isHigherPrecedence(char stackEle, char ele) {
        if ((stackEle == '+' || stackEle == '-') ||
                ((stackEle == '*' || stackEle == '/') && (stackEle == '*' || stackEle == '/'))) {
            return true;
        }
        return false;
    }

    static boolean isOperator(char a) {
        if (a == '+' || a == '-' || a == '*' || a == '/'){
            return true;
        }
        return false;
    }

    static boolean isClosingBracket(char a) {
        return a == ')';
    }

    static boolean isOpeningBracket(char a) {
        return a == '(';
    }

}
