//https://cote.inflearn.com/contest/10/problem/03-03

import java.util.*;

class Test {
    public int solutions(int n, int k, int[] arr){
        int sum = 0;
        
        for(int i = 0; i < k; i++){
            sum += arr[i];
        }
        int max = sum;
        for(int j = k; j < arr.length; j++){
            sum += arr[j] - arr[j-k];
            if(sum > max) max = sum;
        }

        return max;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(T.solutions(n, k, arr));
        
        in.close();      
    }

}
