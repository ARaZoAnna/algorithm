//https://cote.inflearn.com/contest/10/problem/05-07

import java.util.*;

class Test {
    public String solutions(String k, String n){
        String answer = "YES";
        Queue<Character> que = new LinkedList<>();

        for(char tmp : k.toCharArray()) que.offer(tmp);
        for(char c : n.toCharArray()){
            if(que.contains(c) && que.poll() != c) answer = "NO";
        }
        if(!que.isEmpty()) answer = "NO";
        return answer;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        String k = in.next();
        String n = in.next();

        System.out.println(T.solutions(k, n));
        
        in.close();      
    }
}
