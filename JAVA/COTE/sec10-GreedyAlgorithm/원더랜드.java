//https://cote.inflearn.com/contest/10/problem/09-07

import java.io.*;
import java.util.*;

class Edge implements Comparable<Edge>{
  int v1, v2, cost;
  Edge(int v1, int v2, int cost){
    this.v1 = v1;
    this.v2 = v2;
    this.cost = cost;
  }

  @Override
  public int compareTo(Edge o){
    return this.cost - o.cost;
  }
}


public class Main {
    static int[] uf;
    public int find(int a){
      if(a == uf[a]) return a;
      else{
        return uf[a] = find(uf[a]);
      }
    }
    public void union(int a, int b){
      int af = find(a);
      int bf = find(b);
      if(af != bf) uf[af] = bf;
    }
    public static void main(String[] args) throws IOException{
    Main T = new Main();
    //Scanner in=new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int v = Integer.parseInt(st.nextToken());
    int e = Integer.parseInt(st.nextToken());
    
    uf = new int[v+1];
    ArrayList<Edge> arr = new ArrayList<>();
    for(int i = 1; i <= v; i++){
      uf[i] = i;
    }
    for(int i = 0; i < e; i++){
      st = new StringTokenizer(br.readLine());
      int a = Integer.parseInt(st.nextToken());
      int b = Integer.parseInt(st.nextToken());
      int c = Integer.parseInt(st.nextToken());
      arr.add(new Edge(a,b,c));
    }

    Collections.sort(arr);
    int answer = 0;
    for(Edge cur : arr){
      int af = T.find(cur.v1);
      int bf = T.find(cur.v2);
      if(af != bf){
        answer += cur.cost;
        T.union(cur.v1, cur.v2);
      }
    }
    System.out.println(answer);
    return ;
  }
}
