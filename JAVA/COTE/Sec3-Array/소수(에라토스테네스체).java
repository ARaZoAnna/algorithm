//https://cote.inflearn.com/contest/10/problem/02-05

import java.util.*;

class Test {
    

    public int solutions(int n){

        int answer = 0;
        int[] arr = new int[n+1];
        for(int i = 2; i<=n; i++){
            if(arr[i] == 0) answer++; 
            for(int j = i; j<=n; j=j+i) arr[j] = 1;
            
        }

        return answer;
        
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
      
        System.out.println(T.solutions(n));
        
        in.close();
        
    }

}
