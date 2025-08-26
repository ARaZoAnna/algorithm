import java.io.*;
import java.util.*;

public class Main {
    static int n, k, cnt = 0, idx = 0;
    static int arr[];

    public void Dfs(int sum, int idx){
        if(idx == n){
            if(sum == k) cnt++;
            return;
        } 
        else{
            Dfs(sum+arr[idx], idx+1);
            Dfs(sum, idx+1);
        }
    }
    public static void main(String[] args) throws IOException{
        Main T = new Main();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        T.Dfs(0,0);
        if(k == 0) cnt--;
        System.out.println(cnt);
        
    }

}
