//https://www.acmicpc.net/problem/11660


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

    int[][] origin = new int[n+1][n+1];
    int[][] cumsum = new int[n+1][n+1];

    for(int r = 1; r <= n; r++){
      st = new StringTokenizer(br.readLine());
      for(int c = 1; c <= n; c++){
        origin[r][c] = Integer.parseInt(st.nextToken());
        if(r == 1){
          origin[r-1][c] = origin[r][c];
          //cumsum[r-1][c] = origin[r][c];
        }
        if(c == 1){
          origin[r][c-1] = origin[r][c];
          //cumsum[r][c-1] = origin[r][c];
        }
      }
    }

    //누적합 구하기
    for(int r = 1; r <= n; r++){
      for(int c = 1; c <= n; c++){
        if(r == 1 && c == 1) cumsum[r][c] = origin[r][c];
        else if(r == 1){
          cumsum[r][c] = cumsum[r][c-1] + origin[r][c];
        }else if(c == 1){
          cumsum[r][c] = cumsum[r-1][c] + origin[r][c];
        }else{
          cumsum[r][c] = cumsum[r-1][c] + cumsum[r][c-1] - cumsum[r-1][c-1] + origin[r][c];
        }

      }
    }

    for(int i = 0; i < m; i++){
      st = new StringTokenizer(br.readLine());
      int r1 = Integer.parseInt(st.nextToken());
      int c1 = Integer.parseInt(st.nextToken());
      int r2 = Integer.parseInt(st.nextToken());
      int c2 = Integer.parseInt(st.nextToken());

      int answer = cumsum[r2][c2] - ((cumsum[r1-1][c2] + cumsum[r2][c1-1] - cumsum[r1-1][c1-1]));
      System.out.println(answer);
    }



    return ;
  }
}
