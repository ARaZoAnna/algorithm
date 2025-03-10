//https://cote.inflearn.com/contest/10/problem/02-11

import java.util.*;

class Test {
    
    public int solutions(int n, int[][] arr){
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 1; i <= n; i++){
            int cnt = 0;
            for(int j = 1; j <= n; j++){
                for(int k = 1; k <= 5; k++){
                    if(arr[i][k] == arr[j][k]){
                        cnt++;
                        break;
                    }
                }
            }
            if(cnt > max){
                max = cnt;
                answer = i;
            }
        }
        return answer;
        
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n+1][6];

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<= 5; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.print(T.solutions(n, arr));
        
        in.close();
        
    }
}
