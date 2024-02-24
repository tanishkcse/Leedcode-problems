import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Integer> map = new HashMap<>();
        
        // Update map for string s
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        
        // Update map for string t and check consistency
        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false; // Character in t is not present in s
            }
            map.put(c, map.get(c) - 1);
          if(map.get(c)<0){
              return false;
          }
        }
        
        return true;
    }
}
