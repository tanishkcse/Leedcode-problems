import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort(citations);
        for(int i=0; i<n; i++){
            int hIndex = n-i;
            if(citations[i]>=hIndex){
                return hIndex;
            }
        }
        return 0;
    }
}
