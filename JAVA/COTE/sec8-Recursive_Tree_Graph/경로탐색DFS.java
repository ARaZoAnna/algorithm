
import java.util.*;


class Main {
    static int n, m, answer = 0;
    static int[][] graph;
    static int[] check;

    public void DFS(int v){
        //for(int c : check) System.out.print(c + " ");
        if(v == n) answer++;
        else{
            for(int i = 1; i <= n; i++){
                if(graph[v][i] == 1 && check[i] == 0){
                    check[i] = 1;
                    DFS(i);
                    check[i] = 0;
                }
            }
            
        }
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        

        n = in.nextInt();
        m = in.nextInt();

        graph = new int[n+1][n+1];
        check = new int[n+1];
        for(int i = 0; i < m; i++){
            int r = in.nextInt();
            int c = in.nextInt();
            graph[r][c] = 1;
        }
        
        check[1] = 1;
        T.DFS(1);
        System.err.println(answer);        

    }
}
