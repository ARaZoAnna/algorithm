//https://www.acmicpc.net/problem/2110
//이분탐색

import java.io.*;
import java.util.*;

class Main {
    static int n,m;
    public int check(int[] arr, int dist){
        int ep = 0, cnt = 1;
        for(int i = 1; i < n; i++){
            if((arr[i]-arr[ep]) >= dist){
                cnt++;
                ep = i;
            }
        }
        return cnt;
    }
    public int solutions(int[] arr){
        int lt = 1;
        int rt = arr[n-1];
        int mid = 0, ans = 0;
        while(lt <= rt){
            mid = (lt + rt) / 2;
            if(check(arr,mid) >= m){
                lt = mid+1;
                ans = mid;
            }else{
                rt = mid-1;
            }
        }
        return ans;
    }

	public static void main(String[] args) throws IOException{
		Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        
        //st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        Arrays.sort(arr);
        System.out.println(T.solutions(arr));
    }
}
