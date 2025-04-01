//https://cote.inflearn.com/contest/10/problem/05-04

import java.util.*;

class Test {
    public int solutions(String str){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(char c : str.toCharArray()){
            if(c == '+'){
                int b = stack.pop();
                int a = stack.pop();
                stack.add(a+b);
            }
            else if(c == '-'){
                int b = stack.pop();
                int a = stack.pop();
                stack.add(a-b);
            }
            else if(c == '*'){
                int b = stack.pop();
                int a = stack.pop();
                stack.add(a*b);
            }
            else if(c == '/'){
                int b = stack.pop();
                int a = stack.pop();
                stack.add(a/b);
            }
            else {
                int tmp = c - '0';
                stack.add(tmp);
            }
        }
        answer = stack.get(0);
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
