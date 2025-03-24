//https://cote.inflearn.com/contest/10/problem/04-04

import java.util.*;

class Test {
    public int solutions(String s, String t){
        int answer = 0;
        HashMap<Character, Integer> tMap = new HashMap<>();
        HashMap<Character, Integer> sMap = new HashMap<>();

        for(char c : t.toCharArray()){
            //String str = Character.toString(c);
            tMap.put(c, tMap.getOrDefault(c, 0)+1);
        }

        for(int i = 0; i < t.length()-1; i++){
            sMap.put(s.charAt(i),sMap.getOrDefault(s.charAt(i),0)+1);
        }
        
        int lp = 0;
        for(int rp = t.length()-1; rp < s.length(); rp++){
            char key = s.charAt(rp);
            sMap.put(key, sMap.getOrDefault(key, 0)+1);
            //check
            if(sMap.equals(tMap)) answer++;
            //lp 전진하면서 삭제
            sMap.put(s.charAt(lp), sMap.get(s.charAt(lp))-1);
            if(sMap.get(s.charAt(lp)) == 0) sMap.remove(s.charAt(lp));
            lp++;
        }
        return answer;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        String s = in.next();
        String t = in.next();

        System.out.println(T.solutions(s, t));
        
        in.close();      
    }
}
