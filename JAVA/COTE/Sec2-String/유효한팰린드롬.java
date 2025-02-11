//https://cote.inflearn.com/contest/10/problem/01-08

import java.util.*;

class Test {
    public String solutions(String str){
        String answer = "NO";
        //대문자로 변환, 알파벳 이외의 문제는 제외
        str = str.toUpperCase().replaceAll("[^A-Z]","");

        //StringBuilder를 이용해서 문자열 뒤집기
        StringBuilder s = new StringBuilder(str);
        String tmp = s.reverse().toString();
        if(str.equals(tmp)) answer = "YES";

        return answer;
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(T.solutions(str));
        in.close();
        
    }

}
