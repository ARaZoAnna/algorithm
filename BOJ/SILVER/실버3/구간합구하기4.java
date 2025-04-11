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



//====================================================== 


import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


class Test {

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        long[] S = new long[suNo+1];
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < suNo; i++){
            S[i] = S[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int q = 0; q < quizNo; q++){
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int i = Integer.parseInt(stringTokenizer.nextToken());
            int j = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(S[j] - S[i-1]);
        }
           
    }
}
