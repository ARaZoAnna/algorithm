//https://cote.inflearn.com/contest/10/problem/04-02

import java.util.*;

class Test {
    public String solutions(String str1, String str2){
        String answer= "YES";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : str1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) +1);
        }

        for(char c : str2.toCharArray()){
            if(!map.containsKey(c) || map.get(c) == 0) return "NO";
            map.put(c, map.get(c)-1);
        }

        return answer;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        String str1 = in.next();
        String str2 = in.next();

        System.out.println(T.solutions(str1, str2));
        
        in.close();      
    }
}
