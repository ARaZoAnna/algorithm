//https://cote.inflearn.com/contest/10/problem/09-07
import java.io.*;
import java.util.*;

class Edge implements Comparable<Edge>{
  int vex, cost;

  Edge(int vex, int cost){
    this.vex = vex;
    this.cost = cost;
  }
  @Override
  public int compareTo(Edge o){
    return this.cost - o.cost;
  }
}

public class Main {
    
    public static void main(String[] args) throws IOException{
    Main T = new Main();
    //Scanner in=new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int v = Integer.parseInt(st.nextToken());
    int e = Integer.parseInt(st.nextToken());

    ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
    int[] check = new int[v+1];
    for(int i = 0; i <= v; i++){
      graph.add(new ArrayList<Edge>());
    }

    for(int i = 0; i < e; i++){
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      graph.get(a).add(new Edge(b,c));
      graph.get(b).add(new Edge(a,c));
    }

    PriorityQueue<Edge> pQ = new PriorityQueue<>();
    int answer = 0;
    pQ.add(new Edge(1,0));
    while(!pQ.isEmpty()){
      Edge cur = pQ.poll();
      if(check[cur.vex] == 0){
        answer += cur.cost;
        check[cur.vex] = 1;
        for(Edge tmp : graph.get(cur.vex)){
          if(check[tmp.vex] == 0){
            pQ.add(new Edge(tmp.vex, tmp.cost));
          }
        }
      }
    }
    System.out.println(answer);
    return ;
  }
}
