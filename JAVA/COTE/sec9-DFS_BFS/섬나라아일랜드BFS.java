//https://cote.inflearn.com/contest/10/problem/08-13

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
    int[] dr = {0, 1, 0, -1, -1, 1, 1, -1};
    int[] dc = {1, 0, -1, 0, 1, 1, -1, -1};
    static int n, cnt = 0;
    static int[][] map;
    static boolean[][] visited;
    static Queue<Pair> q = new LinkedList<>();

    public void BFS(){

        while(!q.isEmpty()){
            Pair tmp = q.poll();
            int r = tmp.row;
            int c = tmp.col;
            for(int dir = 0; dir < 8; dir++){
                int nr = r + dr[dir]; 
                int nc = c + dc[dir];
                if(nr >= 1 && nr <= n && nc >= 1 && nc <= n && map[nr][nc] == 1 && visited[nr][nc] == false) {
                    q.offer(new Pair(nr, nc));
                    visited[nr][nc] = true;
                }
            }
        }
        
        
    }

    
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();

        map = new int[n+1][n+1];
        visited = new boolean[n+1][n+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                map[i][j] = in.nextInt();
            }
        }
        
        //map을 순회하며서 섬을 발견하면 BFS 수행
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if(map[i][j] == 1 && visited[i][j] == false){
                    q.offer(new Pair(i, j));
                    visited[i][j] = true;
                    T.BFS();
                    cnt++;

                }
            }
        }

        System.out.println(cnt);
    }
}
