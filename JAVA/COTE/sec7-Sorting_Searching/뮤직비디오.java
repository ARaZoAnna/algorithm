//https://cote.inflearn.com/contest/10/problem/06-09

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    public int count(int[] arr, int capacity){
        int cnt = 1, sum = 0;
        for(int num : arr){
            if(sum+num > capacity){
                cnt++;
                sum = num;
            }else{
                sum += num;
            }
        }
        return cnt;
    }

    public int solutions(int n, int k, int[] arr){

        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();
        int mid = 0, answer = 0;
        while(lt<=rt){
            mid = (lt+rt)/2;
            if (count(arr, mid) <= k){
                answer= mid;
                rt = mid-1;
            }else{
                lt = mid+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) throws IOException{
        Main T = new Main();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringtokenizer = new StringTokenizer(bufferedReader.readLine());

        int n = Integer.parseInt(stringtokenizer.nextToken());
        int k = Integer.parseInt(stringtokenizer.nextToken());

        int[] arr = new int[n];
        stringtokenizer = new StringTokenizer(bufferedReader.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(stringtokenizer.nextToken());
        }

        System.out.println(T.solutions(n, k, arr));
        
    }
}
