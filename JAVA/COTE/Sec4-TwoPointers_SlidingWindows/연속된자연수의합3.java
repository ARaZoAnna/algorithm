//https://cote.inflearn.com/contest/10/problem/03-05

import java.util.*;

class Test {
    public int solutions(int n){
        int cnt = 1, answer = 0;
        n--;
        while(n > 0){
            cnt++;
            n -= cnt;
            if(n % cnt == 0) answer++;
        }
        return answer;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();

        System.out.println(T.solutions(n));
        
        in.close();      
    }
}
