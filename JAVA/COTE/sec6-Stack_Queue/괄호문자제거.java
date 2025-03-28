//https://cote.inflearn.com/contest/10/problem/05-02

import java.util.*;

class Test {
    public String solutions(String s){
        String answer = "";
        
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()){
            if(c == ')'){
                while(stack.pop() != '(');
            }else{
                stack.push(c);
            }
        }

        for(int i = 0; i < stack.size(); i++){
            answer += stack.get(i);
        }

        // Deque<Character> deque = new ArrayDeque<>();
        // for(char c : s.toCharArray()){
        //     if(c == ')'){
        //         if(deque.contains('(')){
        //             while(true){
        //                 if(deque.peekLast() == '('){
        //                     deque.pollLast();
        //                     break;
        //                 }
        //                 deque.pollLast();
        //             }
        //         }
        //     }else{
        //         deque.offerLast(c);
        //     }
        // }
        
        // while(!deque.isEmpty()){
        //     answer += deque.peekFirst();
        //     deque.pollFirst();
        // }

            
        

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
