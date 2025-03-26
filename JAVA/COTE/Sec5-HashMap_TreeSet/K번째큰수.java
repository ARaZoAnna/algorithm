//https://cote.inflearn.com/contest/10/problem/04-05

import java.util.*;

class Test {
    public int solutions(int n, int k, int[] arr){
        int answer = -1;
        TreeSet<Integer> tset = new TreeSet<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                for(int z = j+1; z < n; z++){
                    tset.add(arr[i] + arr[j] + arr[z]);
                }
            }
        }

        int idx = 0;
        for(int num : tset){
            idx++;
            if(idx == k) return num;
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

        System.out.println(T.solutions(n, k, arr));
        
        in.close();      
    }
}
