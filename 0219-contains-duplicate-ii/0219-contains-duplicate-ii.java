class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer , Integer > dup = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            if(!dup.containsKey(nums[i])){
                dup.put(nums[i], i);
            }else{
                int pastIndex = dup.get(nums[i]);
                if(Math.abs(pastIndex-i)<=k){
                    return true;
                }
                dup.put(nums[i] , i);
            }
        }
        return false;
    }
}