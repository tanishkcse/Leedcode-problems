

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> mp = new HashMap<>();
        
        for (String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            
            if (!mp.containsKey(sorted)) {
                mp.put(sorted, new ArrayList<>());
            }
            mp.get(sorted).add(str);
        }
        
        res.addAll(mp.values());
        return res;
    }
}
