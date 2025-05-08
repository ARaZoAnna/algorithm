//https://www.inflearn.com/courses/lecture?courseId=326750&type=LECTURE&unitId=73399&tab=curriculum


import java.util.*;


class Main {
    static int n, m;
    static int[] answer;
    public void DFS(int idx){
        if(idx == m){
            for(int x : answer) System.out.print(x + " ");
            System.out.println();
            return;
        }
        else{
            for(int i = 1; i <= n; i++){
                answer[idx] = i;
                DFS(idx+1);
            }
        }
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        answer = new int[m];

        T.DFS(0);
        
    }
}
