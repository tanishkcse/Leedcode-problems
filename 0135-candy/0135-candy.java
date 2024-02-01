public class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candy = new int[n];

        // First pass: Traverse from left to right
        for (int i = 1; i < n; i++) {
            if (ratings[i] > ratings[i - 1]) {
                candy[i] = candy[i - 1] + 1;
            }
        }

        // Second pass: Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i + 1]) {
                candy[i] = Math.max(candy[i], candy[i + 1] + 1);
            }
        }

        // Calculate total candies
        int total = 0;
        for (int i = 0; i < n; i++) {
            total += candy[i];
        }

        return total+n;
    }
}

