import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stk = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            
            // Push the opening brackets onto the stack
            if (currentChar == '(' || currentChar == '{' || currentChar == '[') {
                stk.push(currentChar);
            } else {
                // Check if the stack is empty or the top of the stack doesn't match
                if (stk.isEmpty() || 
                    (currentChar == ')' && stk.peek() != '(') ||
                    (currentChar == '}' && stk.peek() != '{') ||
                    (currentChar == ']' && stk.peek() != '[')) {
                    return false;
                } else {
                    // Pop the matching opening bracket from the stack
                    stk.pop();
                }
            }
        }
        // The string is valid if the stack is empty
        return stk.isEmpty();
    }
}
