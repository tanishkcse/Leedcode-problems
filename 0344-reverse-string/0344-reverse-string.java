class Solution {
    public void reverseString(char[] s) {
      int start=0 , end = s.length-1;
      while(start<=end) { 
      char reverse = s[start];
      s[start]=s[end];
      s[end]=reverse;
      start++;
      end--;
    }
    }
}
