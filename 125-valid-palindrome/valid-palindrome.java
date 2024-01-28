class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("\\s+","").replaceAll(
          "[^a-zA-Z0-9]", "");
        for(int first=0,last=s.length()-1;first<last;first++,last--){
            if(s.charAt(first)!=s.charAt(last)){
                return false;
            }
        }
        return true;
    }
}