//https://www.acmicpc.net/problem/2294

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException{
        Main T = new Main();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] coin = new int[n];
        int[] dp = new int[k+1];
        Arrays.fill(dp, 10001);
        dp[0] = 0;
    
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            coin[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < n; i++){
            for(int j = coin[i]; j <= k; j++){
                dp[j] = Math.min(dp[j - coin[i]] + 1, dp[j]);
            }
        }
        if(dp[k] > 10000) dp[k] = -1;
        System.out.println(dp[k]);
    }   
}
