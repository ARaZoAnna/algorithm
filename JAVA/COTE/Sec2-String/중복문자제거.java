import java.util.*;

class Test {
    public String solutions(String str){
        String answer = "";
        //아스키 코드 이용
        // boolean[] check = new boolean[26];
        // char[] c = str.toCharArray();
        
        // for (char x : c){
        //     int num = x-'a';
        //     if(check[num]) {// 중복된 문자가 있다면
        //         continue;
        //     }
        //     else{ // 중복된 문자가 없다면
        //         check[num] = true;
        //         answer += x;
        //     }
        // }

        //charAt과 indexOf 사용
        for (int i = 0; i < str.length(); i++){
            if (i == str.indexOf(str.charAt(i))){
                answer += str.charAt(i);
            }
        }

        return answer;
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(T.solutions(str));
        in.close();
        
    }

}
