//https://cote.inflearn.com/contest/10/problem/02-01

import java.util.*;

class Test {
    public ArrayList<Integer> solutions(int[] arr){
        ArrayList<Integer> arrList = new ArrayList<>();
        arrList.add(arr[0]);

        for (int idx = 1; idx < arr.length; idx++){
            if(arr[idx-1] < arr[idx]) arrList.add(arr[idx]);
        }

        return arrList;
        
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            int tmp = in.nextInt();
            arr[i] = tmp;
        }

        //T.solutions(str,t);
        ArrayList<Integer> result = T.solutions(arr);
        for(int idx = 0; idx < result.size(); idx++){
            System.out.print(result.get(idx) + " ");
        }

        in.close();
        
    }

}
