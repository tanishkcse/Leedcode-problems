import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] n) {
        Arrays.sort(n);
        Set<List<Integer>> result = new HashSet<>();
        for (int i = 0; i < n.length - 2; i++) {
            int left = i + 1;
            int right = n.length - 1;
            while (left < right) {
                int sum = n[i] + n[left] + n[right];
                if (sum == 0) {
                    List<Integer> triplet = Arrays.asList(n[i], n[left], n[right]);
                    result.add(new ArrayList<>(triplet));
                    left++;
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}

