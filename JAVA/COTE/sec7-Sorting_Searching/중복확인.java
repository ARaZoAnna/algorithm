//https://cote.inflearn.com/contest/10/problem/06-05

import java.util.*;

class Test {
    public String solutions(int n, int[] arr){
        String answer = "U";
        //정렬하기
        Arrays.sort(arr);

        for(int i = 1; i < n; i++){
            if(arr[i-1] == arr[i]) answer = "D";
        }
       
        return answer;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = in.nextInt();
        }
        
        System.out.println(T.solutions(n, arr));
        
        in.close();      
    }
}
