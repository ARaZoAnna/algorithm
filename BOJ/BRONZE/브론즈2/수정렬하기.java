//https://www.acmicpc.net/problem/2750
//버블정렬 구현

import java.io.*;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException{
        Main T = new Main();
        Scanner in = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        //버블정렬 구현
        for(int i = 0; i < n; i++){
            boolean check = false;
            for(int j = 0; j < n-i-1; j++){
                if(arr[j] > arr[j+1]){
                    check = true;
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
            if(!check) break;
        }

        for(int num : arr){
            System.out.println(num);
        }
    }
}
