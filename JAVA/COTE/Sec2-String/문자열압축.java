//https://cote.inflearn.com/contest/10/problem/01-11

import java.util.*;

class Test {
    public String solutions(String str){
        String answer = "";
        str += " ";
        int cnt = 1;

        for(int i = 0; i < str.length()-1; i++){    
            if (str.charAt(i) == str.charAt(i+1)){
                cnt++;
            }
            else{ 
                answer += str.charAt(i);
                if(cnt != 1){
                    answer += Integer.toString(cnt);
                }
                cnt = 1;            
            }
        }
        
        return answer;
        
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        //T.solutions(str,t);
        System.out.println(T.solutions(str));
        in.close();
        
    }

}
