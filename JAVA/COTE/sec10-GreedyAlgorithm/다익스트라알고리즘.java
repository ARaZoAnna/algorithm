//https://www.inflearn.com/courses/lecture?courseId=326750&type=LECTURE&unitId=73415&tab=curriculum
//우선순위 큐 사용

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

class Main {
    static int n, m;
    static ArrayList<ArrayList<Edge>> graph;
    static int[] dis;
    public void solutions(int v){
        //Edge 객체를 통해 자동으로 cost 기준으로 오름차순 정렬
        PriorityQueue<Edge> pQ = new PriorityQueue<>();
        pQ.offer(new Edge(v, 0));
        dis[v] = 0;
        while(!pQ.isEmpty()){
            Edge tmp = pQ.poll();
            int now = tmp.vex;
            int nowCost = tmp.cost;
            if(nowCost > dis[now]) continue;
            for(Edge ob : graph.get(now)){
                if(dis[ob.vex] > ob.cost + nowCost){
                    dis[ob.vex] = ob.cost + nowCost;
                    pQ.add(new Edge(ob.vex, ob.cost+nowCost));
                }
            }
        }

    }
    
    public int solutions(){
            public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        
        n = in.nextInt();
        m = in.nextInt();

        graph = new ArrayList<ArrayList<Edge>>();
        for(int i = 0; i <= n; i++){
            graph.add(new ArrayList<Edge>());
        }

        dis = new int[n+1];
        //초기화 하기
        Arrays.fill(dis, Integer.MAX_VALUE);
        for(int i = 0; i < m; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            graph.get(a).add(new Edge(b,c));
        }
        T.solutions(1);

        //출력
        for(int i = 2; i <= n; i++){
            if(dis[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
            else System.out.println(i + " : impossible");
        }
    }
}
