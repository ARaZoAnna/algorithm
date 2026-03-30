//https://www.acmicpc.net/problem/1253

import java.io.*;
import java.util.*;



public class Main {

    public int solutions(int[] arr, int n){
      int good = 0;
      
      for(int cur = 0; cur < n; cur++){
        int lp = 0;
        int rp = n-1;

        while(lp < rp){
          if(lp == cur) lp++;
          else if(rp == cur) rp--;
          else{
            if(arr[lp] + arr[rp] == arr[cur]){
              good++;
              break;
            }else if(arr[lp] + arr[rp] < arr[cur]){
              lp++;
            }else if(arr[lp] + arr[rp] > arr[cur]){
              rp--;
            }
          }

        }
      }

      return good;
    }
    public static void main(String[] args) throws IOException{
    Main T = new Main();
    //Scanner in=new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int n = Integer.parseInt(st.nextToken());
    int[] arr = new int[n];
    st = new StringTokenizer(br.readLine());
    for(int i = 0; i < n; i++){
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);

    System.out.println(T.solutions(arr, n));
    
    return ;
  }
}
