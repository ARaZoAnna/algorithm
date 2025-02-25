//https://cote.inflearn.com/contest/10/problem/02-06

import java.util.*;

class Test {
    

    public ArrayList<Integer> solutions(int n, int[] arr){
        ArrayList<Integer> list = new ArrayList<>();
        int[] tmp = new int[100001];
        tmp[1] = 1;
        for(int i = 2; i<100001; i++){
            for(int j = i+i; j<100001; j+=i) tmp[j] = 1;
        }

        for(int num : arr){
            String s = num + "";
            StringBuffer buffer = new StringBuffer(s);
            String reverse = buffer.reverse().toString();
            int t = Integer.valueOf(reverse);
            if (tmp[t] == 0) list.add(t);
        }

        return list;
        
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<n; i++){
            arr[i] = in.nextInt();
        }
        ArrayList<Integer> answer = T.solutions(n, arr);
        for(int j = 0; j < answer.size(); j++){
            System.out.println(answer.get(j));
        }
        
        
        in.close();
        
    }

}
