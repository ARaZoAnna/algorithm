//https://www.acmicpc.net/problem/2018

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Test {

    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringtokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringtokenizer.nextToken());

        //변수선언
        int cnt = 0, sum = 0, lp = 1;

        for(int rp = 1; rp <= n; rp++){
            if(sum < n) {
                sum += rp;
            }
            if(sum == n) {
                cnt++;
                sum -= lp;
                lp++;
            }
            if(sum > n){
                while(sum > n){
                    sum -= lp;
                    lp++;
                    if(sum == n) {
                        cnt++;
                        sum -= lp;
                        lp++;
                    }
                    
                }
            }
        }

        System.out.println(cnt);
           
    
    }
}
