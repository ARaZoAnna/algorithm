//https://cote.inflearn.com/contest/10/problem/04-01

import java.util.*;

class Test {
    public char solutions(int n, String str){
        char answer = ' ';
        
        HashMap<Character, Integer> map = new HashMap<>();
        
        for(char key : str.toCharArray()){
            map.put(key, map.getOrDefault(key, 0)+1);
        }

        // System.out.println(map.size());
        // System.out.println(map.remove('A'));
        // System.out.println(map.size());
        // System.out.println(map.containsKey('A'));

        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            if(map.get(key) > max) {
                max = map.get(key);
                answer = key;
            }
        }

        return answer;    
    }

    public static void main(String[] args){
        Test T = new Test();
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        String str = in.next();

        System.out.println(T.solutions(n, str));
        
        in.close();      
    }
}
