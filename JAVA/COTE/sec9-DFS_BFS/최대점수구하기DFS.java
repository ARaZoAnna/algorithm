//https://cote.inflearn.com/contest/10/problem/08-03


import java.util.*;


class Main {
    static int n, limit, answer = Integer.MIN_VALUE;
    static int[][] arr;
    public void DFS(int idx, int maxScore,int sumHours){
        
        if(sumHours > limit) return;
        if(idx == n){
            answer = Math.max(maxScore, answer);
        }
        else{
            DFS(idx+1, maxScore+arr[idx][0] ,sumHours+arr[idx][1]);
            DFS(idx+1, maxScore, sumHours);
        }
        
        
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        limit = in.nextInt();

        arr = new int[n][2];
        for(int i = 0; i < n; i++){
            arr[i][0] = in.nextInt(); //점수
            arr[i][1] = in.nextInt(); //걸리는 시간
        }
        T.DFS(0,0,0);
        System.out.println(answer);
        
    }
}
