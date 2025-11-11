//https://www.acmicpc.net/problem/2293

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
        for(int i = 0; i < n; i++){
            st = new StringTokenizer(br.readLine());
            coin[i] = Integer.parseInt(st.nextToken());
        }

        int[] dp = new int[k+1];
        dp[0] = 1;
        for(int i = 0; i < coin.length; i++){

            for(int j = coin[i]; j <= k; j++){
                dp[j] = dp[j-coin[i]] + dp[j];
            }
        }

        System.out.println(dp[k]);
    }   
}
