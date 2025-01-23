class Solution {
    public String reverseWords(String s) {
      s=s.trim();
      String[] n= s.split("\\s+");
      Collections.reverse(Arrays.asList(n));
      return String.join(" ",n);   
    }
}