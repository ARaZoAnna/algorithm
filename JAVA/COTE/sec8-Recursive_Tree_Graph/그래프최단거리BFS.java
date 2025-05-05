//https://www.inflearn.com/courses/lecture?courseId=326750&type=LECTURE&unitId=72778&tab=curriculum


import java.util.*;


class Main {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> arr;
    static int[] check;
    static int[] distance;
    Queue<Integer> que;

    public void BFS(int v){
        que = new LinkedList<>();
        que.offer(v);
        check[v] = 1;
        distance[v] = 0;

        while(!que.isEmpty()){
            int currentV = que.poll();
            for(int nextV : arr.get(currentV)){
                if(check[nextV] == 0){
                    check[nextV] = 1;
                    distance[nextV] = distance[currentV]+1;
                    que.offer(nextV);
                }
            }

        }      
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();

        check = new int[n+1];
        distance = new int[n+1];
        arr = new ArrayList<>();
        for(int i = 0; i <= n; i++){
            arr.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++){
            int r = in.nextInt();
            int c = in.nextInt();
            arr.get(r).add(c);
        }

        T.BFS(1);
        for(int i = 2; i <= n; i++){
            System.out.println(i + " : " +distance[i]);
        }
    }
}
