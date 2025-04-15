//https://cote.inflearn.com/contest/10/problem/06-10

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


class Main {
    public int count(int[] arr, int dist){
        int cnt = 1, end = arr[0];

        for(int i = 1; i<arr.length; i++){
            if(arr[i]-end >= dist){
                cnt++;
                end = arr[i];
            }
        }
        
        return cnt;
    }

    public int solutions(int n, int k, int[] arr){

        Arrays.sort(arr);
        int lt = 1, rt = arr[n-1], answer = 0;

        while(lt<=rt){
            int mid = (rt+lt)/2;
            if(count(arr,mid) >= k){
                answer = mid;
                lt = mid+1;
            }else rt = mid-1;           
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
