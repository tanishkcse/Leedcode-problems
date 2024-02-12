class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0;
        List<Character> substring = new ArrayList<>();
        int maxLength = 0;
        while (i < s.length() && j < s.length()) {
            if (!substring.contains(s.charAt(j))) {
                substring.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength, j - i);
            } else {
                substring.remove(Character.valueOf(s.charAt(i)));
                i++;
            }
        }
        return maxLength;
    }
}
