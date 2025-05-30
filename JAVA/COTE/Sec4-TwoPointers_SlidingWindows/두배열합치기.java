//https://cote.inflearn.com/contest/10/problem/03-01

import java.util.*;
class Main {
	public static void main(String[] args){
		Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arrN = new int[n];
        for(int i = 0; i < n; i++){
            arrN[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] arrM = new int[m];
        for(int i = 0; i < m; i++){
            arrM[i] = in.nextInt();
        }

        ArrayList<Integer> answer = new ArrayList<>();

        int nidx = 0;
        int midx = 0;

        while(nidx < n && midx < m){
            if(arrN[nidx] <= arrM[midx]) answer.add(arrN[nidx++]) ;
            else if(arrM[midx] < arrN[nidx]) answer.add(arrM[midx++]);
        }
        while(nidx < n) answer.add(arrN[nidx++]);
        while(midx < m) answer.add(arrM[midx++]);

        for(int t : answer) System.out.print(t + " ");
    }
}
