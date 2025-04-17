class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> s;
        for (int i = 0; i < strs.size(); i++) {
            string currWord = strs[i];
            string sortedWord = currWord;
            sort(sortedWord.begin(), sortedWord.end());
            s[sortedWord].push_back(currWord); 
        }
        vector<vector<string>> result;
        for (auto& pair : s) {
            result.push_back(pair.second);
        }
        return result;
    }
};