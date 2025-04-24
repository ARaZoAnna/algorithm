//https://cote.inflearn.com/contest/10/problem/07-08

import java.io.IOException;
import java.util.*;


class Main {

    Queue<Integer> Q = new LinkedList<>();
    int[] check = new int[10001];
    int[] dis = {1,-1,5};
    int level = 0;

    public int BFS(int n, int k){
        Q.offer(n);
        check[n] = 1;

        while(!Q.isEmpty()){
            int len = Q.size();
            for(int i = 0; i < len; i++){
                int cur = Q.poll();
                if(cur == k) {
                    return level;
                }
                for(int tmp : dis){
                    if(cur+tmp >= 1 && cur+tmp <= 10000 && check[cur+tmp] == 0){
                        Q.offer(cur+tmp);
                        check[cur+tmp] = 1;
                    }
                }
            }
            level++;
        }

        return 0;
    }

    public static void main(String[] args) throws IOException{
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        System.out.println(T.BFS(n,k)); 
        
    }
}
