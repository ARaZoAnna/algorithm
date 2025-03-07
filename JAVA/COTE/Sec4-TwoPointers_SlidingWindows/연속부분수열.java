//https://cote.inflearn.com/contest/10/problem/03-04

import java.util.*;

class Test {
    public int solutions(int n, int k, int[] arr){
        
        int answer = 0, sum = 0, lt = 0;

        for(int rt = 0; rt < n; rt++){

            sum += arr[rt];
            if(sum == k) answer++;
            while(sum >= k){
                sum -= arr[lt++];
                if(sum == k) answer++;
            }
        }
        return answer;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(T.solutions(n, k, arr));
        
        in.close();      
    }
}
