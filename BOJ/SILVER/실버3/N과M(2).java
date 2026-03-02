//https://www.acmicpc.net/problem/15650

import java.util.*;
  
public class Main {
  static int n, m;
  static int[] ans, check;
  public void dfs(int L, int idx){
    if(L == m){
      for(int a : ans) System.out.print(a + " ");
      System.out.println();
    }else{
      for(int i = idx; i<= n; i++){
        if(check[i-1] == 0){
          ans[L] = i;
          check[i-1] = 1;
          dfs(L+1, i);
          check[i-1] = 0;
        }
        
      }
    }

  }
  
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    n = in.nextInt();
    m = in.nextInt();
    check = new int[n];
    ans = new int[m];
    T.dfs(0, 1);
    return ;
  }
}
