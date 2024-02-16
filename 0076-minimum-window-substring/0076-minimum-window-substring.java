import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
        int n = s.length();
        int m = t.length();
        if (m > n) {
            return "";
        }

        Map<Character, Integer> mp = new HashMap<>();
        for (char ch : t.toCharArray()) {
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        int reqLen = t.length();
        int i = 0, j = 0;
        int windowSize = Integer.MAX_VALUE;
        int start_i = 0;

        while (j < n) {
            char ch = s.charAt(j);
            if (mp.containsKey(ch)) {
                if (mp.get(ch) > 0) {
                    reqLen--;
                }
                mp.put(ch, mp.get(ch) - 1);
            }

            while (reqLen == 0) {
                int currWindow = j - i + 1;
                if (currWindow < windowSize) {
                    windowSize = currWindow;
                    start_i = i;
                }

                char left = s.charAt(i);
                if (mp.containsKey(left)) {
                    mp.put(left, mp.get(left) + 1);
                    if (mp.get(left) > 0) {
                        reqLen++;
                    }
                }
                i++;
            }

            j++;
        }

        return windowSize == Integer.MAX_VALUE ? "" : s.substring(start_i, start_i + windowSize);
    }
}
