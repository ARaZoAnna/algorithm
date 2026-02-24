//https://www.acmicpc.net/problem/1202

import java.io.*;
import java.util.*;
  
class Pair implements Comparable<Pair>{
  int weight, price;
  Pair(int weight, int price){
    this.weight = weight;
    this.price = price;
  }
  @Override
  public int compareTo(Pair o){
    return this.weight - o.weight;
  }
}

public class Main {

  public void solutions(){
   
  }
  public static void main(String[] args) throws IOException{
    Main T = new Main();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int jewel = Integer.parseInt(st.nextToken());
    int bag = Integer.parseInt(st.nextToken());

    ArrayList<Pair> jewels = new ArrayList<>();
    
    for(int i = 0; i < jewel; i++){
      st = new StringTokenizer(br.readLine());
      int w = Integer.parseInt(st.nextToken());
      int p = Integer.parseInt(st.nextToken());
      jewels.add(new Pair(w, p));
    }
    Collections.sort(jewels);
    Integer[] bags = new Integer[bag];
    for(int i = 0; i < bag; i++){
      st = new StringTokenizer(br.readLine());
      bags[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(bags);

    PriorityQueue<Integer> pQ = new PriorityQueue<>(Collections.reverseOrder());
    int idx = 0;
    long ans = 0;
    for(int num : bags){
      for(; idx < jewels.size(); idx++){
        if(num >= jewels.get(idx).weight) pQ.add(jewels.get(idx).price);
        else break;
      }
      if(!pQ.isEmpty()) ans += pQ.poll();
    }
    
    System.out.println(ans);
    return ;
  }
}
