//https://www.acmicpc.net/problem/10986

import java.io.*;
import java.util.*;



public class Main {
    public static void main(String[] args) throws IOException{
    Main T = new Main();
    //Scanner in=new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    long[] cumsum = new long[n];
    long[] check = new long[m];
    st = new StringTokenizer(br.readLine());
    long sum = 0;
    for(int i = 0; i < n; i++){
      sum += Integer.parseInt(st.nextToken());
      cumsum[i] = sum;
    }

    long answer = 0;
    for(int i = 0; i < n; i++){
      int reminder = (int)(cumsum[i] % m);
      if(reminder == 0) answer++;
      check[reminder]++;
    }

    for(int i = 0; i < m; i++){
      if(check[i] > 1){
        answer += (check[i] * (check[i] -1 ) / 2);
      }
    }
    System.out.println(answer);
    return ;
  }
}
