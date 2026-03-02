//https://www.acmicpc.net/problem/15650

import java.util.*;
  
public class Main {
  static int n, m;
  static int[] ans;
  public void dfs(int L, int idx){
    if(L == m){
      for(int a : ans) System.out.print(a + " ");
      System.out.println();
    }else{
      for(int i = idx; i<= n; i++){
        ans[L] = i;
        dfs(L+1, i+1);
      }
    }

  }
  
  public static void main(String[] args){
    Main T = new Main();
    Scanner in=new Scanner(System.in);
    n = in.nextInt();
    m = in.nextInt();
    ans = new int[m];
    T.dfs(0, 1);
    return ;
  }
}
