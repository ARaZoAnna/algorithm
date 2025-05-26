//https://cote.inflearn.com/contest/10/problem/10-03

import java.util.*;

class Main {
    static int n, check;
    static int[] arr;
    static int[] dy;
    static boolean flag = true;
    
    public int solutions(){
        int answer = Integer.MIN_VALUE;
        dy[0] = 1;
        for(int i = 1; i < n; i++){
            int idx = i-1;
            flag = true;
            check = Integer.MIN_VALUE;
            while(idx >= 0){
                if(arr[idx] < arr[i] && check < dy[idx]){
                    check = dy[idx];
                    dy[i] = dy[idx]+1;
                    flag = false;
                }
                idx--;
            }
            if(flag) dy[i] = 1;
            if(answer < dy[i]) answer = dy[i];
            
        }
        return answer;
    }
    public static void main(String[] args){
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        
        n = in.nextInt();
        arr = new int[n];
        dy = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(T.solutions());
        //for(int x : dy) System.out.print(x + " ");

    }
}
