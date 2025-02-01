//https://cote.inflearn.com/contest/10/problem/01-03

//import java.nio.charset.CharacterCodingException;
import java.util.*;

class Test {
    public String solutions(String str){
        String answer = "";
        int max = Integer.MIN_VALUE;
        
        //split 사용
        // String[] arr = str.split(" ");

        // for (String x : arr){
        //     if (x.length() > max){
        //         max = x.length();
        //         answer = x;
        //     }
        // }

        //indexOf와 substring 사용
        int pos = Integer.MIN_VALUE;
        while(str.indexOf(' ')!=-1){
            pos = str.indexOf(' ');
            
            if (max < pos){
                max = pos;
                answer = str.substring(0,pos);
                
            }
            str = str.substring(pos+1);
        }
        if(max < str.length()) answer = str;
        
        return answer;
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.print(T.solutions(str));

    }

}
