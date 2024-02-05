class Solution {
    public String reverseWords(String s) {
        StringBuilder reverseStr = new StringBuilder();
        String[] arr = s.split("\\s+"); // used for removing spaces from string 
        for(int i=arr.length-1; i>=0; i--){
            reverseStr.append(arr[i]);
            reverseStr.append(" ");
        }

        return reverseStr.toString().trim();

        
    }
}