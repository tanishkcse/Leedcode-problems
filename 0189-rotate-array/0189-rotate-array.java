class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n; // In case k is greater than the length of the array 
        // revese from 0 to n-1
        reverse(nums, 0 , n-1);

    // reverse the first k element 
    reverse(nums , 0 ,k-1 );

    // reverse the remaining n-k element 
    reverse(nums , k , n-1);

        
    }
    public void reverse (int[] nums , int start , int end){
       while(start<end){
           int temp = nums[start];
           nums[start]=nums[end];
           nums[end]=temp;
           start++;
           end--;
       }
    }
}