//https://cote.inflearn.com/contest/10/problem/08-10

import java.util.*;

class Main {
    static int n = 7, cnt = 0;
    static int[] dr = {0,1,0,-1}, dc = {1,0,-1,0}; //상하좌우 방향키
    static int[][] map = new int[n+1][n+1];//미로지도
    static boolean [][] visited = new boolean[n+1][n+1];//방문배열

    public void DFS(int row, int col){
        if(row == n && col == n){
            cnt++;
        }else{
            for(int dir = 0; dir < 4; dir++){
                int nr = row+dr[dir];
                int nc = col+dc[dir];
                if(nr > 0 && nr <= n && nc > 0 && nc <= n && visited[nr][nc] == false && map[nr][nc] == 0 ){
                    visited[nr][nc] = true;
                    DFS(nr, nc);
                    visited[nr][nc] = false;
                } 
            }
        }

    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        //입력값 지도에 넣기
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                map[i][j] = in.nextInt();
            }
        }
        visited[1][1] = true;
        T.DFS(1, 1);
        System.out.println(cnt);
    }
}
