//https://www.acmicpc.net/problem/17298

import java.io.*;
import java.util.*;
  
public class Main {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());

    int n = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];
    int[] ans = new int[n];

    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }

    Stack<Integer> stack = new Stack<>();
    for(int idx = 0; idx < n; idx++){
      while(!stack.isEmpty() && arr[stack.peek()] < arr[idx]){
        ans[stack.pop()] = arr[idx];
      }
      stack.add(idx);
    }

    while(!stack.isEmpty()){
      ans[stack.pop()] = -1;
    }

    StringBuilder sb = new StringBuilder();

    for(int a : ans){
      sb.append(a).append(' ');
    }

    System.out.println(sb);
    //for(int a : ans) System.out.print(a + " ");
    return ;
  }
}
