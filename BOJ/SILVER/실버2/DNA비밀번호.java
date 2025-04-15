//https://www.acmicpc.net/problem/12891
//슬라이딩 윈도우와 맵을 활용하였다.

import java.io.IOException;
import java.util.*;


class Main {
    public int solutions(int n, int k, String str, HashMap<Character, Integer> ruleMap){
        int answer = 0, lp = 0, len = 0;
        //int[] check = new int[4];
        HashMap<Character, Integer> check = new HashMap<>();
        char[] charArr = str.toCharArray();

        for(int rp = 0; rp < n; rp++){
            //알파벳 카운트 할것
            check.put(charArr[rp], check.getOrDefault(charArr[rp], 0)+1);
            //길이 체크
            len++;
            if(len == k){
                // 알파벳 갯수가 같은지 확인할 것
                boolean flag = true;
                for(Character key : ruleMap.keySet()){
                    if(check.getOrDefault(key,0) < ruleMap.get(key)){
                        flag = false;
                        break;
                    } 
                }
                if(flag) answer++;

                //lp 위치에 있는 알파벳 값을 제외한다. 
                check.put(charArr[lp], check.get(charArr[lp])-1);
                //값이 0이면 제거
                if(check.get(charArr[lp])== 0) check.remove(charArr[lp]);
                lp++; 
                len--;
                
            }
        }

        return answer;
    }

    public static void main(String[] args) throws IOException{
        Main T = new Main();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();

        String str = in.next();

        HashMap<Character, Integer> ruleMap = new HashMap<>();
        int[] rule = new int[4];
        for(int i = 0; i < 4; i++){
            rule[i] = in.nextInt();
        }
        ruleMap.put('A', ruleMap.getOrDefault('A',in.nextInt()));
        ruleMap.put('C', ruleMap.getOrDefault('C', in.nextInt()));
        ruleMap.put('G', ruleMap.getOrDefault('G', in.nextInt()));
        ruleMap.put('T', ruleMap.getOrDefault('T', in.nextInt()));



        System.out.println(T.solutions(n, k, str, ruleMap));
        
    }
}
