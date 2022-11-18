package interviews.glovo.live_coding_interview.questions;

import leetcode.ValidParentheses;

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
        return ValidParentheses.isValid(expr);
    }
}
