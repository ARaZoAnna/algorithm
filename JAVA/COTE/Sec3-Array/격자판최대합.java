//https://cote.inflearn.com/contest/10/problem/02-09

import java.util.*;

class Test {
    

    public int solutions(int n, int[][] arr){
        int answer = Integer.MIN_VALUE;

        int sum1 = 0; 
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for(int j = 0; j < n; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            answer = Math.max(sum1, answer);
            answer = Math.max(sum2, answer);
        }

        sum1 = sum2 = 0;
        for(int k = 0; k < n; k++){
            sum1 += arr[k][k];
            sum2 += arr[k][n-k-1];
        }
        answer = Math.max(sum1, answer);
        answer = Math.max(sum2, answer);


        return answer;
        
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j< n; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.print(T.solutions(n, arr));
        
        in.close();
        
    }

}
