//https://www.acmicpc.net/problem/1940

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Test {

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringtokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringtokenizer.nextToken());

        stringtokenizer = new StringTokenizer(bufferedReader.readLine());

        int m = Integer.parseInt(stringtokenizer.nextToken());

        //배열 생성
        int[] arr = new int[n];
        stringtokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringtokenizer.nextToken());
        }
        //정렬하기
        Arrays.sort(arr);

        //변수선언
        int sum = 0, lp = 0, rp = n-1, cnt = 0;

        //반복문
        while(lp < rp){
            sum = arr[lp] + arr[rp];
            if(sum < m) lp++;
            else if(sum == m){
                cnt++;
                lp++;
            }
            else if(sum > m) rp--;
        }

        System.out.println(cnt);
    
    }
}
