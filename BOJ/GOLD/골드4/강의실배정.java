//https://www.acmicpc.net/problem/11000

import java.util.*;

class Pair implements Comparable<Pair>{
 int start, end;
  Pair(int start, int end){
    this.start = start;
    this.end = end;
  }
  @Override
  public int compareTo(Pair o){
    if(this.start == o.start) return this.end - o.end;
    else return this.start - o.start; 
  }
}
public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n = in.nextInt();

    ArrayList<Pair> schd = new ArrayList<>();
    for(int i = 0; i < n; i++){
      int s = in.nextInt();
      int e = in.nextInt();
      schd.add(new Pair(s, e));
    }
    Collections.sort(schd);
    
    PriorityQueue<Integer> pQ = new PriorityQueue<>();
  
    int ans = 0;
    for(int idx = 0; idx < schd.size(); idx++){
      while(!pQ.isEmpty() && pQ.peek() <= schd.get(idx).start) {
        pQ.poll();
      }
      pQ.add(schd.get(idx).end);
      ans = Math.max(ans, pQ.size());
      
    }

    System.out.println(ans);
    return ;
  }
}
