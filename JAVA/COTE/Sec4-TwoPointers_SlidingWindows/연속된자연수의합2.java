//https://cote.inflearn.com/contest/10/problem/03-05

import java.util.*;

class Test {
    public int solutions(int n){
        int m = n/2 + 1;
        int[] arr = new int[m];
        for(int i = 1; i <= m; i++) arr[i-1] = i;
        int answer = 0, lt = 0, sum = 0;

        for(int rt = 0; rt < m; rt++){
            sum += arr[rt];
            if(sum == n) answer++;
            while(sum >= n){
                sum -= arr[lt++];
                if(sum == n) answer++;
            }
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
