package amazon_questions.interviewbit;

import java.util.Stack;

/**
 * <a href="https://www.geeksforgeeks.org/evaluate-the-value-of-an-arithmetic-expression-in-reverse-polish-notation-in-java/">Evaluate the Value of an Arithmetic Expression in Reverse Polish Notation in Java</a>
 */
public class ReversePolishNotation {
    public static int find(String[] tokens)
    {

        // Initialize the stack and the variable
        Stack<String> stack = new Stack<>();
        int x, y;
        String result = "";
        int get = 0;
        String choice;
        int value = 0;
        String p = "";

        // Iterating to the each character
        // in the array of the string
        for (int i = 0; i < tokens.length; i++) {

            // If the character is not the special character
            // ('+', '-' ,'*' , '/')
            // then push the character to the stack
            if (tokens[i] != "+" && tokens[i] != "-"
                    && tokens[i] != "*" && tokens[i] != "/") {
                stack.push(tokens[i]);
                continue;
            }
            else {
                // else if the character is the special
                // character then use the switch method to
                // perform the action
                choice = tokens[i];
            }

            // Switch-Case
            switch (choice) {
                case "+":

                    // Performing the "+" operation by poping
                    // put the first two character
                    // and then again store back to the stack

                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x + y;
                    result = p + value;
                    stack.push(result);
                    break;

                case "-":

                    // Performing the "-" operation by poping
                    // put the first two character
                    // and then again store back to the stack
                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = y - x;
                    result = p + value;
                    stack.push(result);
                    break;

                case "*":

                    // Performing the "*" operation
                    // by poping put the first two character
                    // and then again store back to the stack

                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = x * y;
                    result = p + value;
                    stack.push(result);
                    break;

                case "/":

                    // Performing the "/" operation by poping
                    // put the first two character
                    // and then again store back to the stack

                    x = Integer.parseInt(stack.pop());
                    y = Integer.parseInt(stack.pop());
                    value = y / x;
                    result = p + value;
                    stack.push(result);
                    break;

                default:
                    continue;
            }
        }

        // Method to convert the String to integer
        return Integer.parseInt(stack.pop());
    }
}
