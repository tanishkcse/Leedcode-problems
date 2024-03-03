class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int totalGas = 0;
        int totalCost = 0;
        int remainingGas = 0;
        int startPos = 0; // Initialize startPos to -1

        for (int i = 0; i < gas.length; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
            remainingGas += gas[i] - cost[i];

            if (remainingGas < 0) {
                startPos = i+1; // Update startPos only when remainingGas becomes negative
                remainingGas = 0; // Reset remainingGas to 0
            }
        }

        // Check if totalGas is less than totalCost
        if (totalGas < totalCost) {
            return -1;
        }

        return startPos;
    }
}
