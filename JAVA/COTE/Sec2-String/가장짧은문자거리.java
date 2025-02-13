//https://cote.inflearn.com/contest/10/problem/01-10

import java.util.*;

class Test {
    public ArrayList<Integer> solutions(String str, String t){
        ArrayList<Integer> arr = new ArrayList<>();
        int pre_idx = 999;
        
        for (int i = 0; i < str.length(); i++){
            int post_idx = str.indexOf(t,i);
            if (Math.abs(pre_idx-i) > Math.abs(post_idx-i) ){
                arr.add(Math.abs(post_idx-i));
            }
            else{
                arr.add(Math.abs(pre_idx-i));
            }
            if (Math.abs(post_idx-i) == 0){
                pre_idx = i;
            }
        }
        return arr;
        
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String t = in.next();

        System.out.println(T.solutions(str, t));
        in.close();
        
    }

}
