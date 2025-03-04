//https://cote.inflearn.com/contest/10/problem/02-12

import java.util.*;

class Test {
    public int solutions(int row, int col, int[][] arr){
        int answer = 0;
      
        for(int i = 1; i <= col; i++){
            for(int j = 1; j <= col; j++){
                int student_i = 0, student_j = 0;
                int cnt = 0;
                for(int test = 1; test <= row; test++){
                    for(int score = 1; score <= col; score++){
                        if(arr[test][score] == i) student_i = score;
                        if(arr[test][score] == j) student_j = score;
                    }
                    if(student_i > student_j) cnt++;
                }
                if(cnt == row) answer++;
            }
        }
        
        return answer;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        int col = in.nextInt();
        int row = in.nextInt();
        int[][] arr = new int[row+1][col+1];

        for(int i = 1; i<=row; i++){
            for(int j = 1; j<= col; j++){
                arr[i][j] = in.nextInt();
            }
        }

        System.out.print(T.solutions(row, col, arr));
        
        in.close();      
    }

}
