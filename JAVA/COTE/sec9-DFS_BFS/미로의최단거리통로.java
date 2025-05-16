//https://cote.inflearn.com/contest/10/problem/08-11

import java.util.*;

class Pair{
    int row;
    int col;
    public Pair(int row, int col){
        this.row = row;
        this.col = col;
    }
}

class Main {
    int[] dr = {0, 1, 0, -1};
    int[] dc = {1, 0, -1, 0};
    static int n = 7;
    static int[][] map = new int[n+1][n+1];
    static int[][] visited = new int[n+1][n+1];
    Queue<Pair> q = new LinkedList<>();

    public void BFS(int r, int c){
        q.offer(new Pair(r,c));
        visited[r][c] = 1;

        while(!q.isEmpty()){
            Pair tmp = q.poll();
            int cr = tmp.row;
            int cc = tmp.col;

            for(int dir = 0; dir < 3; dir++){
                int nr = cr + dr[dir];
                int nc = cc + dc[dir];
                if(nr >= 1 && nr <= n && nc >= 1 && nc <= n && visited[nr][nc] == 0 && map[nr][nc] == 0){
                    visited[nr][nc] = visited[cr][cc]+1;
                    q.offer(new Pair(nr, nc));
                }
            }
        }
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                map[i][j] = in.nextInt();
            }
        }
        
        T.BFS(1,1);
        System.out.println(visited[n][n]-1);
    }
}
