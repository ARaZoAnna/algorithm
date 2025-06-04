//https://www.inflearn.com/courses/lecture?courseId=330396&type=LECTURE&unitId=149829&tab=curriculum&subtitleLanguage=ko



import java.util.*;

class Solution {
    public int solution(int[][] board){
        int[] dr = {-1, 0, 1, 0}, dc = {0, 1, 0, -1};
        int answer = 0, len = 10, hDir = 0, aDir = 0;
        int hr = 0, hc = 0, nhr = 0, nhc = 0;
        int ar = 0, ac = 0, nar = 0, nac = 0;

        // 위치 찾기 (현수와 강아지 둘 다)
        for(int r = 0; r < len; r++) {
            for(int c = 0; c < len; c++) {
                if(board[r][c] == 2) {
                    hr = r;
                    hc = c;
                }
                if(board[r][c] == 3) {
                    ar = r;
                    ac = c;
                }
            }
        }

        while(answer < 10000) {
            answer++;
            nhr = hr + dr[hDir];
            nhc = hc + dc[hDir];
            nar = ar + dr[aDir];
            nac = ac + dc[aDir];

            // 현수 이동
            if (nhr < 0 || nhr >= len || nhc < 0 || nhc >= len || board[nhr][nhc] == 1) {
                hDir = (hDir + 1) % 4;
            } else {
                hr = nhr;
                hc = nhc;
            }

            // 강아지 이동
            if (nar < 0 || nar >= len || nac < 0 || nac >= len || board[nar][nac] == 1) {
                aDir = (aDir + 1) % 4;
            } else {
                ar = nar;
                ac = nac;
            }

            // 만나면 종료
            if (hr == ar && hc == ac) break;
        }

        return answer >= 10000 ? 0 : answer;
    }

    public static void main(String[] args){
        Solution T = new Solution();
        int[][] arr1 = {
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
            {0, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 1, 0, 0, 0, 1, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 1, 0, 0, 0, 2, 0, 0}, 
            {1, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 3, 0, 0, 0, 1}, 
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, 
            {0, 1, 0, 1, 0, 0, 0, 0, 0, 0}
        };
        System.out.println(T.solution(arr1)); // -> 51

        int[][] arr2 = {
            {1, 0, 0, 0, 1, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 1, 0, 0, 0}, 
            {0, 0, 1, 1, 0, 0, 0, 1, 0, 0}, 
            {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 0}, 
            {1, 0, 0, 0, 0, 0, 1, 0, 1, 0}, 
            {0, 0, 0, 1, 0, 0, 0, 0, 0, 0}, 
            {0, 0, 1, 0, 0, 0, 0, 0, 2, 1}, 
            {0, 0, 0, 1, 0, 1, 0, 0, 0, 1}, 
            {0, 1, 0, 1, 0, 0, 0, 0, 0, 3}
        };
        System.out.println(T.solution(arr2)); // -> 정답 24
    }
}
