//https://cote.inflearn.com/contest/10/problem/01-01
import java.util.*;

class Test {
    public int solution(String str, char c){
        int answer = 0;
        // 대문자로 변환
        c = Character.toUpperCase(c);
        str = str.toUpperCase();

        // 같은 문자는 몇개인지 확인
        // for (int idx = 0; idx < str.length() ; idx++){
        //     if(str.charAt(idx) == c)   answer += 1;
        // }
        //for each로 확인
        for(char x : str.toCharArray()){
            if (x == c) answer += 1;

        }
        return answer;
    }

    public static void main(String[] args){
        Test t = new Test();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char c = in.next().charAt(0);

        System.out.print(t.solution(str, c));
    }

}
