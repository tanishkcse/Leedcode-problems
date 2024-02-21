import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> mp = new HashMap<>();
        for (char ch : ransomNote.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }
        for (char ch : magazine.toCharArray()) {
            if (mp.containsKey(ch)) {
                mp.put(ch, mp.get(ch) - 1);
                if (mp.get(ch) == 0) {
                    mp.remove(ch);
                }
            }
        }
        return mp.isEmpty();
    }
}
