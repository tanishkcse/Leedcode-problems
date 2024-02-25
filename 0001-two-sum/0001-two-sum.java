class Solution {
    public int[] twoSum(int[] nums, int target) {
    Map<Integer , Integer > mp = new HashMap<>();
    for(int i=0; i<nums.length; i++){
        int compliment =  target-nums[i];
        if(mp.containsKey(compliment)){
            return new int[]{mp.get(compliment), i};
        }
        mp.put(nums[i], i);
    }
    return new int[]{};
    }
}
