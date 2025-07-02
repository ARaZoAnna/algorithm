//https://www.acmicpc.net/problem/2015

import java.util.*;

class Main {
    static int n, k;
    public long solutions(int[] arr){
        long ans = 0; // long 타입으로 해야했음.
        int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i = 0; i < n; i++){
            sum += arr[i];
            if(map.containsKey(sum-k)) ans += map.get(sum-k);
            map.put(sum, map.getOrDefault(sum, 0)+1);
        }

        return ans;
    }
    
	public static void main(String[] args){
		    Main T = new Main();
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        k = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }

        System.out.println(T.solutions(arr));
    }
}
