//https://cote.inflearn.com/contest/10/problem/10-05

import java.util.*;

class Main {
    static int n, k;
    static int[] coin, dy;
    public void solutions(){
        dy[0] = 0;
        for(int c = 0; c < n; c++){
            for(int p = coin[c]; p <= k; p++){
                int tmp = dy[p - coin[c]] + 1;
                dy[p] = Math.min(dy[p], tmp);
            }
        }
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        
        n = in.nextInt();
        coin = new int[n];

        for(int i = 0; i<n; i++){
            coin[i] = in.nextInt();
        }

        k = in.nextInt();
        dy = new int[k+1];
        //초기화하기기
        Arrays.fill(dy, Integer.MAX_VALUE);
        T.solutions();
        System.out.println(dy[k]);
    }
}
