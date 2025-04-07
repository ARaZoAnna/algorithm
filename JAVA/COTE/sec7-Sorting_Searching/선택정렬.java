//https://cote.inflearn.com/contest/10/problem/06-01

import java.util.*;


class Test {
    
    public int[] solutions(int n, int[] arr){
        
        //선택정렬
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[min]) min = j;
            }

            int tmp = arr[i];
            arr[i] = arr[min];
            arr[min] = tmp;
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
