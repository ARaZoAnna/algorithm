//https://www.acmicpc.net/problem/2343
//이분탐색

import java.io.*;
import java.util.*;

class Main {
    static int n,m;
    public int check(int[] arr,int mid){
        int sum = 0, cnt = 1;
        for(int num : arr){
            sum += num;
            if(sum > mid){
                sum = num;
                cnt++;
            }
        }
        return cnt;
    }
    public int solutions(int[] arr){
        int ans = 0, mid = 0;
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();

        while(lt <= rt){
            mid = (lt + rt) / 2;
            //System.out.println("mid: " + mid + "cnt: " + check(arr,mid));
            if(check(arr, mid)<=m){
                rt = mid-1;
                ans = mid;
            }else{
                lt = mid+1;
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
        
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        

        System.out.println(T.solutions(arr));
    }
}
