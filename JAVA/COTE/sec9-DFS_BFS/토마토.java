//https://cote.inflearn.com/contest/10/problem/08-12

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
    static int n, m, cnt, answer;
    static int[][] map;
    static int[][] visited;
    static Queue<Pair> q = new LinkedList<>();

    public int BFS(){
        
        while(!q.isEmpty()){
            Pair tmp = q.poll();
            int cr = tmp.row;
            int cc = tmp.col;

            for(int dir = 0; dir < 4; dir++){
                int nr = cr + dr[dir];
                int nc = cc + dc[dir];
                if(nr >= 1 && nr <= n && nc >= 1 && nc <= m && visited[nr][nc] == 0 && map[nr][nc] == 0){
                    visited[nr][nc] = visited[cr][cc]+1; // 방문 표시(시간으로)
                    cnt = visited[nr][nc];
                    map[nr][nc] = 1; //익은 토마토로 변경
                    q.offer(new Pair(nr, nc));
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        m = in.nextInt();
        n = in.nextInt();

        map = new int[n+1][m+1];
        visited = new int[n+1][m+1];
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                map[i][j] = in.nextInt();
                if(map[i][j] == 1){
                    q.offer(new Pair(i,j)); // 익은 토마토일 경우 Queue에 삽입
                    visited[i][j] = 1;
                }
            }
        }
        
        answer = T.BFS();
        boolean ans = true;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= m; j++){
                if(map[i][j] == 0){
                    ans = false;
                    break;
                }
            }
        }
        if(ans) System.out.println(answer-1);
        else System.out.println(-1);
    }
}
