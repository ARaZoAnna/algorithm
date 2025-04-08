//https://cote.inflearn.com/contest/10/problem/06-06

import java.util.*;

class Test {  
    public ArrayList<Integer> solutions(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        int[] tmp = arr.clone();
        Arrays.sort(tmp);
        for(int i = 0; i < n; i++){
            if(arr[i] != tmp[i]) answer.add(i+1);
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
        
        for(int num : T.solutions(n, arr)) System.out.print(num + " ");
        
        in.close();      
    }
}
