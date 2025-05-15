//https://www.inflearn.com/courses/lecture?courseId=326750&type=LECTURE&unitId=73404&tab=curriculum&subtitleLanguage=ko

import java.util.*;

class Main {
    static int n, m;
    static int[] p;

    public void combinations(int depth, int s){
        if(depth == m){
            for(int x : p) System.out.print(x + " ");
            System.out.println();
        }else{
            for(int i = s; i <= n; i++){
                p[depth] = i;
                combinations(depth+1, i+1);
            }
        }

    }

    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        m = in.nextInt();

        p = new int[m];
        T.combinations(0, 1);
    }
}
