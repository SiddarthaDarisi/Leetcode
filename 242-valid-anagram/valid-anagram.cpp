class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length() != t.length()){
            return false;
        }

        int frequency[26] = {0};
        int m,g;
        for(int i=0; i<s.length(); i++){
            m = (int)(s[i]-'a');
            g = (int)(t[i]-'a');
            frequency[m]++;
            frequency[g]--;
        }
        for(int i=0; i<26; i++){
            if(frequency[i] != 0){
                return false;
            }
        }
        return true;
    }
};