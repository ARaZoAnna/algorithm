//https://cote.inflearn.com/contest/10/problem/02-04

import java.util.*;

class Test {
    public int[] solutions(int n){
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for(int idx = 2; idx < n; idx++){
            arr[idx] = arr[idx-1] + arr[idx-2];
        }
        return arr;
        
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int num : T.solutions(n)){
            System.out.print(num + " ");
        }
        
        in.close();       
    }

}
