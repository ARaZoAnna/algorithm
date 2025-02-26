//https://cote.inflearn.com/contest/10/problem/02-07

import java.util.*;

class Test {
    

    public int solutions(int n, int[] arr){
        int answer = 0;
        int cnt = 0;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == 1){
                cnt++;
                answer+=cnt;
            }else{
                cnt=0;
            }
        }

        return answer;
        
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(T.solutions(n, arr));
        
        
        in.close();
        
    }

}
