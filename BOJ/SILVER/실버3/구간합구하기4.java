//https://www.acmicpc.net/problem/11659

import java.util.*;


class Test {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        
        //구간 저장할 배열 생성
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            if(i == 0) arr[i] = in.nextInt();
            else arr[i] = (arr[i-1] + in.nextInt());
        }
        
        
        int st, en, answer;
        for(int i = 0; i < m; i++){
            st = in.nextInt();
            en = in.nextInt();
            if(st-2 <0) answer = arr[en-1];
            else answer = (arr[en-1] - arr[st-2]);
            System.out.println(answer);    
        }

        
        in.close();      
    }
}
