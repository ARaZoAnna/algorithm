//https://www.acmicpc.net/problem/12865

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Main T = new Main();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] w = new int[n+1]; //무게 저장
        int[] v = new int[n+1]; //가치 저장
        int[][] dp = new int[n+1][k+1];
        for(int i = 1; i <= n; i++){
            st = new StringTokenizer(br.readLine());
            w[i] = Integer.parseInt(st.nextToken());
            v[i] = Integer.parseInt(st.nextToken());
        }

        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= k; col++){
                //담을 수 없을때
                if(w[row] > col){
                    dp[row][col] = dp[row-1][col];
                }
                else{ //담을 수 있을때(담지 않았을때, 담았을때 비교해서 가치가 큰것)
                    dp[row][col] = Math.max(dp[row-1][col], dp[row-1][col-w[row]]+v[row]);
                }
            }
        }
        System.out.println(dp[n][k]);
    }   
}
