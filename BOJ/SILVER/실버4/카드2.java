//https://www.acmicpc.net/problem/2164

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException{
    Main T = new Main();
    //Scanner in=new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    Queue<Integer> q = new LinkedList<>();
    for(int i = 1; i <= n; i++){
      q.add(i);
    }

    boolean check = true;
    while(q.size() > 1){
      if(check){
        q.poll();
        check = false;
      }else{
        q.add(q.poll());
        check = true;
      } 

    }
    
    System.out.println(q.poll());
    return ;
  }
}
