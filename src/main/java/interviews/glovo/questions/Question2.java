package interviews.glovo.questions;

import java.util.ArrayDeque;
import java.util.Deque;

//Write an algorithm that given a string containing any combination of the characters
//'(', ')', '{', '}', '[' and ']', determines if the input string is valid.
//
//An input string is valid when:
//
//- Opening parentheses are closed by the same type of closing parentheses, and
//- Opening parentheses are closed in the correct order.
//https://codeshare.io/eVe4LA
public class Question2 {
    public static boolean containingAnyCombination(String expr){
        // Using ArrayDeque is faster than using Stack class
        Deque<Character> stack = new ArrayDeque<>();

        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                // Push the element in the stack
                stack.push(x);
                continue;
            }

            // If current character is not opening
            // bracket, then it must be closing. So stack
            // cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        // Check Empty Stack
        return (stack.isEmpty());
    }
}
