//https://cote.inflearn.com/contest/10/problem/05-03


import java.util.*;

class Test {
    public int solutions(int n, int[][] arr, int m, int[] moves){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(int col : moves){
            int row = 0;
            col--;
            while (row < n) { 
                if(arr[row][col] == 0) row++;
                else{
                    if(!stack.isEmpty() && stack.peek() == arr[row][col]){
                        stack.pop();
                        answer += 2;
                    }else{
                        stack.add(arr[row][col]);
                    }
                    arr[row][col] = 0;
                    break;
                }
                
            }
        }

        return answer;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int m = in.nextInt();
        int[] moves = new int[m];
        for(int i = 0; i < m; i++) moves[i] = in.nextInt();

        System.out.println(T.solutions(n, arr, m, moves));
        
        in.close();      
    }
}
