//https://cote.inflearn.com/contest/10/problem/10-06

import java.util.*;
class Test {
    int score, time;
    public Test(int score, int time){
        this.score = score;
        this.time = time;
    }
}


class Main {
    static int n, m;
    static ArrayList<Test> lst;
    static int[] dy;
    public void solutions(){
        for(Test t : lst){
            int score = t.score;
            int time = t.time;
            for(int cur = m; cur >= time; cur--){
                dy[cur] = Math.max(dy[cur], dy[cur-time] + score);
            }
        }
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        
        n = in.nextInt();
        m = in.nextInt();

        lst = new ArrayList<>();
        dy = new int[m+1];
        for(int i = 0; i < n; i++){
            int s = in.nextInt();
            int t = in.nextInt();
            lst.add(new Test(s,t));
        }
        T.solutions();
        System.out.println(dy[m]);
    }
}
