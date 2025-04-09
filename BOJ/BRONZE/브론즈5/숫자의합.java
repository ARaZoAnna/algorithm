//https://www.acmicpc.net/problem/11720

import java.util.*;

class Test {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String str = in.next();

        char[] cArr = str.toCharArray();
        int answer = 0;

        for(int i = 0; i < cArr.length; i++){
            answer += (cArr[i] - '0');
        }
        System.out.println(answer);
        
        in.close();      
    }
}
