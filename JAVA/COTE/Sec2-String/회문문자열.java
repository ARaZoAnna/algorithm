//https://cote.inflearn.com/contest/10/problem/01-07

import java.util.*;

class Test {
    public String solutions(String str){
        String answer = "YES";
        str = str.toUpperCase();

        // int lt = 0;
        // int rt = str.length()-1;
        
        // while(lt < rt){
        //     if (str.charAt(lt) != str.charAt(rt)){
        //         answer = "NO";
        //     }
        //     lt++;
        //     rt--;
        // }

        //StringBuilder 사용
        StringBuilder s = new StringBuilder(str);
        String tmp = s.reverse().toString();
        if (!str.equals(tmp)) answer = "NO";

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
