//https://www.inflearn.com/courses/lecture?courseId=326750&type=LECTURE&unitId=72777&tab=curriculum&subtitleLanguage=ko

import java.util.*;


class Main {
    static int n, m, answer = 0;
    static ArrayList<ArrayList<Integer>> arr;
    static int[] check;

    public void DFS(int v){
        if(v == n) answer++;
        else{
            for(int tmp : arr.get(v)){
                if(check[tmp] == 0){
                    check[tmp] = 1;
                    DFS(tmp);
                    check[tmp] = 0;
                }
            }
        }
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        arr = new ArrayList<ArrayList<Integer>>();
        check = new int[n+1];
        for(int i = 0; i <= n; i++){
            arr.add(new ArrayList<Integer>());
        }       

        for(int i = 0; i < m; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            arr.get(a).add(b);
        }

        check[1] = 1;
        T.DFS(1);
        System.out.println(answer);
    }
}
