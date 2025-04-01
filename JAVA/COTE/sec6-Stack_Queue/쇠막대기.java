//https://cote.inflearn.com/contest/10/problem/05-05

import java.util.*;

class Test {
    public int solutions(String str){
        int answer = 0;
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '('){
                stack.add(str.charAt(i));
            }else if(str.charAt(i) == ')'){
                if(str.charAt(i-1) == '('){
                    stack.pop();
                    answer += stack.size();
                }else if(str.charAt(i-1) == ')'){
                    stack.pop();
                    answer++;
                }
            }
        }
        return answer;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        String str = in.next();

        System.out.println(T.solutions(str));
        
        in.close();      
    }
}
