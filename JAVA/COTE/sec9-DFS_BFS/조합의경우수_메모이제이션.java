//https://cote.inflearn.com/contest/10/problem/08-07

import java.util.*;

class Main {
    int[][] memo = new int[35][35]; //static이 없으면 함수만 접근 가능 메인은 접근 불가
    public int DFS(int n, int r){
        if(memo[n][r] != 0) return memo[n][r]; //메모이제이션 활용용
        if(n == r || r == 0) return 1;
        else{
            return memo[n][r] = DFS(n-1, r-1) + DFS(n-1, r);//이차원 배열에 값을 저장장
        }
        
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int r = in.nextInt();

        System.out.println(T.DFS(n, r));
    }
}
