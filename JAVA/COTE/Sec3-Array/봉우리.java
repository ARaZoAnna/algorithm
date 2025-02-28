//https://cote.inflearn.com/contest/10/problem/02-10

import java.util.*;

class Test {
    

    public int solutions(int n, int[][] arr){
        int answer = 0;

        int[] dr = {1,0,-1,0};
        int[] dc = {0,1,0,-1};


        for(int row = 1; row < n-1; row++){
            for(int col = 1; col < n-1; col++ ){
                boolean check = true;
                for(int i = 0; i < 4; i++){
                    if(arr[row][col] <= arr[row+dr[i]][col+dc[i]]){
                        check = false;
                        break;
                    }
                }
                if(check) answer++;
            }
        }

        return answer;
        
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n+2][n+2];

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<= n; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.print(T.solutions(n+2, arr));
        
        in.close();
        
    }

}
