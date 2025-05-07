//https://www.acmicpc.net/problem/11724

import java.util.*;


class Main {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> arr;
    static int[] check;
    static boolean flag = false;
    public void DFS(int idx){
        if(flag) return;
        for(int num : arr.get(idx)){
            if(check[num] == 0){
                check[num] = 1;
                flag = false;
                DFS(num);
            }
        }
        
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        arr = new ArrayList<>();
        check = new int[n+1];
        for(int i = 0; i <= n; i++){
            arr.add(new ArrayList<>());
        }

        for(int i = 0; i < m; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            arr.get(a).add(b);
            arr.get(b).add(a);
            //방향 없는 그래프
        }

        for(int i = 1; i <= n; i++){
            if(check[i] == 0){
                flag = false;
                check[i] = 1;
                T.DFS(i);
                answer++;
            }
        }
        System.out.println(answer);

    }
}
