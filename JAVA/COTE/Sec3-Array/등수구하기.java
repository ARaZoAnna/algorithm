//https://cote.inflearn.com/contest/10/problem/02-08

import java.util.*;

class Test {
    

    public int[] solutions(int n, int[] arr){
        int[] answer = new int[n];
        
        for(int i = 0; i < arr.length; i++){
            int cnt = 1;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] < arr[j]) cnt++;
            }
            answer[i] = cnt;
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

        for(int num : T.solutions(n, arr)){
            System.out.print(num + " ");
        }
        
        
        
        in.close();
        
    }

}
