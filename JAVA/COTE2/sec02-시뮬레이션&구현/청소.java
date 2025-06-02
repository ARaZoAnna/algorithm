import java.util.*;
class Solution {

	public int[] solution(int[][] board, int k){
        int[] dr = {0, 1, 0, -1};
        int[] dc = {1, 0, -1, 0};
        int cnt = 0;
        int dir = 0;
        int len = board.length;
		int[] answer = new int[2]; 
		
        while(cnt++ < k){
            int nr = answer[0]+dr[dir];
            int nc = answer[1]+dc[dir];
            if(nr < 0 || nr >= len || nc < 0 || nc >= len || board[nr][nc] == 1){
                dir = (dir+1) % 4;
            }else if(board[nr][nc] == 0){
                answer[0] = nr;
                answer[1] = nc;
            }
            System.out.println(cnt + ": " + answer[0] + " " + answer[1]);
        }

		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		int[][] arr1 = {{0, 0, 0, 0, 0}, 
			{0, 1, 1, 0, 0}, 
			{0, 0, 0, 0, 0}, 
			{1, 0, 1, 0, 1}, 
			{0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr1, 10)));
		int[][] arr2 = {{0, 0, 0, 1, 0, 1}, 
			{0, 0, 0, 0, 0, 0}, 
			{0, 0, 0, 0, 0, 1}, 
			{1, 1, 0, 0, 1, 0}, 
			{0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr2, 20)));
		int[][] arr3 = {{0, 0, 1, 0, 0}, 
			{0, 1, 0, 0, 0}, 
			{0, 0, 0, 0, 0}, 
			{1, 0, 0, 0, 1}, 
			{0, 0, 0, 0, 0}};
		System.out.println(Arrays.toString(T.solution(arr3, 25)));
		
	}
}
