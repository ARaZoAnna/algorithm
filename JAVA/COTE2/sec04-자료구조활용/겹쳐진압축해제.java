//https://www.inflearn.com/courses/lecture?courseId=330396&type=LECTURE&unitId=149916&tab=curriculum&subtitleLanguage=ko

import java.io.*;
import java.util.*;

public class Main {
    static String str;
    static String ans ="";
    public void solutions(char[] arr){
        Stack<String> stack = new Stack<>();
        
        for(char c : arr){
            String tmp = "";
            if(c == ')'){
                String s = stack.pop();
                while(!s.equals("(")){
                    tmp = s + tmp;
                    s = stack.pop();
                }

                if(Character.isDigit(stack.peek().charAt(0))){
                    int num = Integer.parseInt(stack.pop());
                    String res = "";
                    for(int i = 0; i < num; i++){
                        res += tmp;
                    }
                    stack.add(res);
                }
                else{
                    stack.add(tmp);
                    tmp = "";
                }

            }else{
                stack.add(Character.toString(c));
            }
        
        }

        for(String a : stack){
            ans += a;
        }
    }

    public static void main(String[] args) throws IOException{
        Main T = new Main();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        str = st.nextToken();

        T.solutions(str.toCharArray());

        System.out.println(ans);

    }   
}
