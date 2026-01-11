//https://leetcode.com/problems/first-unique-character-in-a-string/
// HashMap 사용
// for 문 2번 


class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        boolean none = true;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            if(map.get(c) == 1){
                ans = i;
                none = false;
                break;
            }
        }
        if(none) return -1; 
        return ans;
    }
}
