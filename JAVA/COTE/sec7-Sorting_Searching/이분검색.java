//https://cote.inflearn.com/contest/10/problem/06-08

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringtokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringtokenizer.nextToken());
        int k = Integer.parseInt(stringtokenizer.nextToken());

        int[] arr = new int[n];
        stringtokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringtokenizer.nextToken());
        }
        //정렬하기
        Arrays.sort(arr);
        //변수 선언
        int lp = 0, rp = n-1, mid = 0, answer = 0; 
        while(true){
            //mid 설정하기
            mid = (lp+rp) /2 ;
            //값 체크
            if(arr[mid] == k) {
                answer = mid+1;
                break;
            }else if(arr[mid] > k){
                rp = mid-1;
            }else if(arr[mid] < k){
                lp = mid+1;
            }

        }
        System.out.println(answer);
    }
}
