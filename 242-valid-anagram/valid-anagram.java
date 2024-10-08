class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length()!=t.length())
        {
            return false;
        }
        int[] a= new int[26];
        
        for(int i=0;i<s.length();i++){
            a[(((int)s.charAt(i)-'a') )]++;
            a[(((int)t.charAt(i)-'a'))]--;
        }
        for(int i=0;i<a.length;i++){
            if(a[i]!=0){
                return false;
            }
        }
        return true;
    }
}