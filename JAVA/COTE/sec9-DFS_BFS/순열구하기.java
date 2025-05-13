//https://www.inflearn.com/courses/lecture?courseId=326750&type=LECTURE&unitId=73401&tab=curriculum

import java.util.*;

class Main {
    static int n, m;
    static int[] arr, check, pm;
    public void DFS(int depth){
        if(depth == m){
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
            return;
        }else{
            for(int i = 0; i< n; i++){
                if(check[i] == 0){
                    pm[depth] = arr[i];
                    check[i] = 1;
                    DFS(depth+1);
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

        arr = new int[n];
        check = new int[n];
        pm = new int[m];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        T.DFS(0);

    }
}
