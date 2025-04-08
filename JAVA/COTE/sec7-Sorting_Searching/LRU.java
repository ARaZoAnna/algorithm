//https://cote.inflearn.com/contest/10/problem/06-04

import java.util.*;


class Test {
    public int[] solutions(int s ,int n, int[] arr){
        
        //배열을 사용하자
        int[] cache = new int[s];

        for(int idx = 0; idx < n; idx++){
            int pos = -1;
            //hit
            for(int i = 0; i < s; i++){
                if(cache[i] == arr[idx]) pos = i;
            } 
            //miss
            if(pos == -1){
                for(int j = s-1; j > 0; j--) cache[j] = cache[j-1];
            }else{
                for(int j = pos; j > 0; j--) cache[j] = cache[j-1];
            }
            cache[0] = arr[idx];
        }
       
        return cache;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        int s = in.nextInt();
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        for(int tmp : T.solutions(s, n, arr)){
            System.out.print(tmp + " ");
        }
        
        in.close();      
    }
}
