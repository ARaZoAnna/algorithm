//https://www.inflearn.com/courses/lecture?courseId=330396&tab=curriculum&type=LECTURE&unitId=149958&subtitleLanguage=ko

import java.io.*;

public class Main {
    char[] arr;     // 원본 숫자 배열
    int[] check;    // 방문 체크
    char[] tmp;     // 임시 숫자 조합
    int len;        // 숫자 길이
    int n;          // 원본 숫자
    int min;        // 결과 최소값

    public void dfs(int depth){
        if(depth == len){
            String s = "";
            for(char t : tmp) s += t;
            int result = Integer.parseInt(s.trim());
            if(result > n && min > result) min = result;
        }else{
            for(int i = 0; i < len; i++){
                if(check[i] == 0){                   
                    check[i] = 1;
                    tmp[depth] = arr[i];
                    dfs(depth+1);
                    check[i] = 0;
                }
            }
        }
    }

    public int solution(int n){
        min = Integer.MAX_VALUE;
        this.n = n;

        String str = Integer.toString(n);
        arr = str.toCharArray();
        len = arr.length;
        tmp = new char[len];
        check = new int[len];

        dfs(0);
        
        if(min == Integer.MAX_VALUE) min = -1;
        return min;
    }

    public static void main(String[] args) throws IOException{
        Main T = new Main();
        
        int n;
        n = 123;
        System.out.println(T.solution(n)); 

        n = 321;
        System.out.println(T.solution(n));
        
        n = 20573;
        System.out.println(T.solution(n));

        n = 27711;
        System.out.println(T.solution(n));

        n = 54312;
        System.out.println(T.solution(n));
    }   
}
