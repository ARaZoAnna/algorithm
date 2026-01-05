//https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int lt = 0, cnt = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for(int rt = 0; rt < ch.length; rt++){
            map.put(ch[rt], map.getOrDefault(ch[rt], 0) + 1);
            if(map.get(ch[rt]) == 1){
                cnt = Math.max(cnt, map.size());
            }else{
                while(map.get(ch[rt])>1){
                    map.put(ch[lt], map.get(ch[lt])-1);
                    if(map.get(ch[lt]) == 0) map.remove(ch[lt]);
                    lt++;
                }
                
            }
        }

        return cnt;
    }
}
