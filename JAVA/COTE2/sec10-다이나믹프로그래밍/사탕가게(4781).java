//https://www.acmicpc.net/problem/4781

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException{
        Main T = new Main();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = (int)Math.round(Double.parseDouble(st.nextToken())*100);

            if(n == 0 && m == 0) break;

            int[] dp = new int[m+1];

            for(int i = 0; i < n; i++){
                st = new StringTokenizer(br.readLine());
                int kcal = Integer.parseInt(st.nextToken());
                int money = (int)Math.round(Double.parseDouble(st.nextToken())*100);

                for(int j = money; j <= m; j++){
                    dp[j] = Math.max(dp[j], dp[j-money] + kcal);
                }
            }

            System.out.println(dp[m]);
        }

    }   
}
