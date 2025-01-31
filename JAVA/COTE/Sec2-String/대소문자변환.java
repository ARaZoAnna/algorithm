//https://cote.inflearn.com/contest/10/problem/01-02
import java.util.*;

class Test {
    public String solutions(String str){
        String answer = "";

        // for (char x : str.toCharArray()){
        //     if (Character.isUpperCase(x)) answer += Character.toLowerCase(x);
        //     else answer += Character.toUpperCase(x);
        // }

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= 65 && str.charAt(i)<=90){//대문자 아스키코드 65~90
                answer += (char)(str.charAt(i)+32);
            }
            else{// 소문자 아스키코드 97~122
                answer += (char)(str.charAt(i)-32);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.print(T.solutions(str));

    }

}
