//https://leetcode.com/problems/valid-parentheses/

import java.util.*;
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == ')'){
                if(stack.pop() == '(') continue;
                else return false; 
            }else if(c == ']'){
                if(stack.pop() == '[') continue;
                else return false;

            }else if(c == '}'){
                if(stack.pop() == '{') continue;
                else return false;
            }else{
                stack.add(c);
            }
        }
        if(stack.isEmpty()) return true;
        else return false;
    }
}
