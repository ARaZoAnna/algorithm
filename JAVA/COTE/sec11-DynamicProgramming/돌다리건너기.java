//https://cote.inflearn.com/contest/10/problem/10-02

import java.util.*;

class Main {
    static int n;
    static int[] dy;
    public int DFS(int n){
        dy[1] = 1;
        dy[2] = 2;
        for(int i = 3; i <= n+1; i++){
            dy[i] = dy[i-1] + dy[i-2];
        }
        return dy[n+1];
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        
        n = in.nextInt();
        dy = new int[n+2];
        System.out.println(T.DFS(n));
        

    }
}
