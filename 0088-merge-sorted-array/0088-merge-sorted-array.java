class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
       List<Integer> list = new ArrayList<>();
       int i=0, j=0;
       while(i<m && j<n){
           if(nums1[i]<nums2[j]){
               list.add(nums1[i]);
               i++;
           }
           else{
               list.add(nums2[j]);
               j++;
           }
       }
       while(i<m){
           list.add(nums1[i]);
           i++;
       }
       while(j<n){
           list.add(nums2[j]);
           j++;
       }
       for(i=0; i<m+n; i++){
           nums1[i]=list.get(i);
       }
        
    }
}