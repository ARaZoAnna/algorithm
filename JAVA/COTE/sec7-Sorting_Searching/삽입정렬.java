//https://cote.inflearn.com/contest/10/problem/06-03

import java.util.*;


class Test {

    
    public int[] solutions(int n, int[] arr){
        
        //삽입 정렬

        for(int i = 1; i < n; i++){
            int tmp = arr[i], j;
            for(j = i-1; j >= 0; j--){
                if(arr[j] > tmp) arr[j+1] = arr[j];
                else break;
            }
            arr[j+1] = tmp;
        }
       
        return arr;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        for(int tmp : T.solutions(n, arr)){
            System.out.print(tmp + " ");
        }
        
        
        in.close();      
    }
}
