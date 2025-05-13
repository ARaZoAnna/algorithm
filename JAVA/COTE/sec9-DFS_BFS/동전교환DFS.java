//https://cote.inflearn.com/contest/10/problem/08-05
import java.util.*;


class Main {
    static int n, m, answer = Integer.MAX_VALUE;
    static Integer[] coin;
    public void DFS( int sum, int depth){
        if(depth >= answer || sum > m) return;
        else if(sum == m){
            answer = Math.min(answer, depth);
        }
        else{
            for(int i = 0; i < n; i++){
                DFS(sum+coin[i], depth+1);
            }
        }
       
    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        coin = new Integer[n];

        for(int i = 0; i < n; i++) coin[i] = in.nextInt();

        //내림차순으로 정렬 -> 안하면 시간초과
        // 내림차순 정렬 시행시 "객체" 배열로 선언해야 함.
        Arrays.sort(coin, Collections.reverseOrder());

        m = in.nextInt();//거슬러줄 금액
        
        
        T.DFS(0,0);
        System.out.println(answer);

    }
}
