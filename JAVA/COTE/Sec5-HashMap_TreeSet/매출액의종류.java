//https://cote.inflearn.com/contest/10/problem/04-03

import java.util.*;

class Test {
    public ArrayList<Integer> solutions(int n, int k, int[] arr){
        ArrayList<Integer> answer= new ArrayList<>();

        int cnt = 0, lp =0;
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int rp = 0; rp < n; rp++){
            if(cnt < k){
                map.put(arr[rp], map.getOrDefault(arr[rp], 0)+1);
                cnt++;
            }
            if(cnt == k){
                answer.add(map.size());
                
                map.put(arr[lp], map.get(arr[lp])-1);
                if(map.get(arr[lp]) == 0) map.remove(arr[lp]);
                lp++;
                cnt--;
            }
        }
        return answer;    
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

        for(int num : T.solutions(n, k, arr)){
            System.out.print(num + " ");
        }
        //System.out.println(T.solutions(n,k,arr));
        
        in.close();      
    }
}
