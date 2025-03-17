//https://cote.inflearn.com/contest/10/problem/03-06

import java.util.*;

class Test {
    public int solutions(int n, int k, int[] arr){
        int cnt = 0;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        int lp = 0; 

        for(int rp = 0; rp < n; rp++){

            if(arr[rp] == 1) {
                cnt++;
                continue;
            }
            else{
                if(list.size() == k){
                    if(max < cnt) max = cnt;
                    
                    lp = list.get(0)+1;
                    list.remove(0);
                    cnt = (rp - lp);
                    rp--;

                } 
                else if(list.size() < k){
                    list.add(rp);
                    cnt++;
                } 
            }
        }

        return max;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int k = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(T.solutions(n, k, arr));
        
        in.close();      
    }
}
