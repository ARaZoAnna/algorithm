//https://cote.inflearn.com/contest/10/problem/08-07
//순열 + 조합 문

import java.util.*;

class Main {
    static int n,f;
    static int[] arr, check, answer;
    boolean finish = false;
    int[][] memo = new int[11][11];
    public int combination(int a, int b){
        if(memo[a][b] > 0) return memo[a][b];
        if(a == b || b == 0){
            return 1;
        }else{
            return memo[a][b] = combination(a-1, b-1) + combination(a-1, b);
        }  
    }
    public void permutation(int depth, int sum){
        if(finish) return;
        if(depth == n && sum == f){
            for(int x : answer) System.out.print(x + " ");
            finish = true;
        }
        else{
            for(int i = 1; i <= n; i++){
                if(check[i] == 0){
                    answer[depth] = i;
                    check[i] = 1;
                    permutation(depth+1, sum+(answer[depth]*arr[depth]));
                    check[i] = 0;
                }
                
            }
        }
        
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        f = in.nextInt();

        arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = T.combination(n-1, i);
        }
        check = new int[n+1];
        answer= new int[n];
        T.permutation(0,0);

    }
}
