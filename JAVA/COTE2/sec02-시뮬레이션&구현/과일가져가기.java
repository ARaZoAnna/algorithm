//https://www.inflearn.com/courses/lecture?courseId=330396&type=LECTURE&unitId=149833&subtitleLanguage=ko&audioLanguage=ko

import java.util.*;

class Solution {
	//최소값 구하기
	public int getMinValue(int[] fruit){
		int min = Integer.MAX_VALUE;
		for(int i = 0; i < 3; i++){
			if(min > fruit[i]) min = fruit[i];
		}
		return min;
	}
	//최소값이 유니크 한가?
	public boolean isMinUnique(int[] fruit){
		int min = getMinValue(fruit);
		int cnt = 0;
		for(int i = 0; i < 3; i++) if(fruit[i] == min) cnt++;
		return cnt == 1;
	}
	//최소값의 인덱스 구하기
	public int getMinIndex(int[] fruit){
		int min = getMinValue(fruit);
		for(int i = 0; i < 3; i++) if(fruit[i] == min) return i;
		return 0;
	}


	public int solution(int[][] fruit){
		int answer = 0;
		int len = fruit.length;
		boolean[] check = new boolean[len];

		for(int i = 0; i < len; i++){
			if(check[i]) continue;
			//값이 유니크한가?
			if(isMinUnique(fruit[i]) == false) continue;
			//최소값의 인덱스 구하기
			int a = getMinIndex(fruit[i]);

			for(int j = i+1; j < len; j++){
				if(check[j]) continue;
				//값이 유니크한가?
				if(isMinUnique(fruit[j]) == false) continue; 
				//최소값의 인덱스 구하기기
				int b = getMinIndex(fruit[j]);
				
				if(a != b && fruit[i][b] > 0 && fruit[j][a] > 0){
					if(fruit[i][a] + 1 <= fruit[i][b]-1 && fruit[j][b]+1 <= fruit[j][a]-1){
						fruit[i][a]++;
						fruit[i][b]--;
						fruit[j][b]++;
						fruit[j][a]--;

						check[i] = true;
						check[j] = true;
						break;
					}
				}
			}
		}
		for(int[] ans : fruit){
			answer += getMinValue(ans);
		}
		return answer;
	}

	public static void main(String[] args){
		Solution T = new Solution();
		System.out.println(T.solution(new int[][]{{10, 20, 30}, {12, 15, 20}, {20, 12, 15}, {15, 20, 10}, {10, 15, 10}}));
		System.out.println(T.solution(new int[][]{{10, 9, 11}, {15, 20, 25}}));	
		System.out.println(T.solution(new int[][]{{0, 3, 27}, {20, 5, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}}));
		System.out.println(T.solution(new int[][]{{3, 7, 20}, {10, 15, 5}, {19, 5, 6}, {10, 10, 10}, {15, 10, 5}, {3, 7, 20}, {12, 12, 6}, {10, 20, 0}, {5, 10, 15}}));
	}
}
