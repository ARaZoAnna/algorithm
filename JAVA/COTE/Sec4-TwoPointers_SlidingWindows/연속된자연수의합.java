//https://cote.inflearn.com/contest/10/problem/03-05

import java.util.*;

class Test {
    public int solutions(int n){
        
        int answer = 0;
        int start = 1;
        int end = 2;
        int tmp = 1;
        while(end < n){
            tmp += end;
            //System.out.println(tmp);
            if(tmp == n) {
                //System.out.println(tmp);
                answer++;
            }
            if(tmp < n) {
                end++;
            }
            else if(tmp >= end){
                start++;
                tmp = start;
                end = start+1;
            }
        }
        
        return answer;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();

        System.out.println(T.solutions(n));
        
        in.close();      
    }
}
