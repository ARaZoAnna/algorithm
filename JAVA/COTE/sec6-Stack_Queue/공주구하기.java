//https://cote.inflearn.com/contest/10/problem/05-06

import java.util.*;

class Test {
    public int solutions(int n, int k){
        int answer = 0;
        Queue<Integer> que = new LinkedList<>();
        int cnt = 0;
        for(int i = 1; i <= n; i++){
            cnt ++;
            if(cnt == k){
                cnt = 0;
                continue;
            } 
            que.add(i);
        }
        while (que.size() > 1) { 
            cnt++;
            if(cnt == k){
                que.poll();
                cnt = 0;
                continue;
            }   
            que.add(que.poll());
        }

        answer = que.peek();

        
        return answer;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();

        System.out.println(T.solutions(n, k));
        
        in.close();      
    }
}
