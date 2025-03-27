//https://cote.inflearn.com/contest/10/problem/05-01

import java.util.*;

class Test {
    public String solutions(String s){
        String answer = "YES";
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == '(') stack.push(c);
            else if(c == ')'){
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        if(!stack.isEmpty()) return"NO";
        return answer;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        String s = in.next();

        System.out.println(T.solutions(s));
        
        in.close();      
    }
}
