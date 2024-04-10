import java.util.*;

class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> countWord = new HashMap<>();
        for (String word : words) {
            countWord.put(word, countWord.getOrDefault(word, 0) + 1);
        }

        int wordSize = words[0].length();
        int WindowSize = words.length * wordSize;
        for (int i = 0; i <= s.length() - WindowSize; i++) {

            Map<String, Integer> seen = new HashMap<>(countWord);
            int left = i;
            int match = 0;
            for (int startIdx = i; startIdx <= i + WindowSize - wordSize; startIdx += wordSize) {
                String CurrWord = s.substring(startIdx, startIdx + wordSize);
                if (seen.containsKey(CurrWord)) {
                    seen.put(CurrWord, seen.get(CurrWord) - 1);
                    if (seen.get(CurrWord) == 0) {
                        match++;
                    }
                    if (match == seen.size()) {
                        list.add(left);
                        break;
                    }
                }
            }
        }
        return list;
    }
}
