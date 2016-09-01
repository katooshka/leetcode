package solutions;

import java.util.ArrayList;
import java.util.List;

public class ValidParentheses {
    public boolean isValid(String s) {
        List<Character> stack = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '[' || ch == '(' || ch == '{') {
                stack.add(ch);
            } else {
                char correspondingOpeningBracket = getCorrespondingBracket(ch);
                char topBracket = stack.get(stack.size() - 1);
                if (stack.size() != 0 && topBracket == correspondingOpeningBracket) {
                    stack.remove(stack.size() - 1);
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private char getCorrespondingBracket(char bracket) {
        switch (bracket) {
            case ']':
                return '[';
            case ')':
                return '(';
            case '}':
                return '{';
            default:
                throw new AssertionError("impossible");
        }
    }
}
