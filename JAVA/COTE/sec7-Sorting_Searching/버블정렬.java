//https://cote.inflearn.com/contest/10/problem/06-02

import java.util.*;


class Test {

    
    public int[] solutions(int n, int[] arr){
        
        //버블정렬
        
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
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
