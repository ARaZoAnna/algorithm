//https://www.acmicpc.net/problem/1427
//선택정렬 구현하기

import java.io.*;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException{
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        int n = str.length();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(str.substring(i, i+1));
        }
        
        //선택 정렬 구현
        for(int i = 0; i < n; i++){
            int max = arr[i];
            int idx = 0;
            for(int j = i+1; j < n; j++){
                if(arr[j] > max ){
                    max = arr[j];
                    idx = j;
                } 
            }
            if(idx != 0){
                int tmp = arr[idx];
                arr[idx] = arr[i];
                arr[i] = tmp;
            }
        }
        
        for(int num : arr){
            System.out.print(num);
        }
    }
}
