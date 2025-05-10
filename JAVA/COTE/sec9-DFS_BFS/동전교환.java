//https://cote.inflearn.com/contest/10/problem/08-05


import java.util.*;


class Main {
    static int n, m, cnt = 0;
    static int[] coin;
    static Queue<Integer> que = new LinkedList<>();
    public void BFS(){
        while(!que.isEmpty()){
            int len = que.size();
            for(int i = 0; i < len; i++){
                int cur = que.poll();
                if(cur == m) return;
                else if(cur > m) continue;
                else{
                    for(int plus : coin){
                        que.offer(cur+plus);
                    }
                }
            }
            cnt++;
        }
       
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        coin = new int[n];

        for(int i = 0; i < n; i++){
            coin[i] = in.nextInt();
        }

        m = in.nextInt();//거슬러줄 금액
        
        for(int num : coin){
            que.offer(num);
        }
        cnt = 1;
        T.BFS();
        System.out.println(cnt);

    }
}
