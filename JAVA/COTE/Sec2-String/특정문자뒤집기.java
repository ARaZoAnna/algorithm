//https://cote.inflearn.com/contest/10/problem/01-05

import java.util.*;

class Test {
    public String solutions(String str){
        char[] c = str.toCharArray();

        int lt = 0;
        int rt = str.length()-1;
        
        while(lt < rt){
            if (!Character.isAlphabetic(c[lt])) lt++;

            else if (!Character.isAlphabetic(c[rt])) rt--;

            else{
                char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }

        String s = String.valueOf(c);
        return s;
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println(T.solutions(str));
        
    }

}
