//https://cote.inflearn.com/contest/10/problem/08-02


import java.util.*;


class Main {
    static int k, n, max = Integer.MIN_VALUE;
    static int[] arr;
    public void DFS(int sum, int idx){
        if(sum > k) return;
        if(idx == n){
            max = Math.max(sum, max);
            return;
        }
        
        else{
            //if(sum > max) max = sum;
            DFS(sum+arr[idx], idx+1);
            DFS(sum, idx+1);
        }
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        k = in.nextInt();
        n = in.nextInt();

        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        T.DFS(0,0);
        System.out.println(max);
    }
}
