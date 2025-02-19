//https://cote.inflearn.com/contest/10/problem/02-03

import java.util.*;

class Test {
    

    public ArrayList<String> solutions(int n, int[] arr_A, int[] arr_B){
        ArrayList<String> answer = new ArrayList<>();

        for(int idx = 0; idx < n; idx++){
            if (arr_A[idx] - arr_B[idx] == 0) answer.add("D");
            else if (arr_A[idx] - arr_B[idx] == 1 || arr_A[idx] - arr_B[idx] == -2) answer.add("A");
            else if (arr_A[idx] - arr_B[idx] == -1 || arr_A[idx] - arr_B[idx] == 2) answer.add("B");
            
        }

        return answer;
        
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr_A = new int[n];
        for(int i = 0; i < n; i++){
            arr_A[i] = in.nextInt();
        }
        int[] arr_B = new int[n];
        for(int i = 0; i < n; i++){
            arr_B[i] = in.nextInt();
        }

        for(String s : T.solutions(n, arr_A, arr_B)){
            System.out.println(s);    
        }

        in.close();
        
    }

}
