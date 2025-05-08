class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int>mpp;
        vector<int>ans;
        for(int i=0 ;i<nums.size();i++){
            mpp[nums[i]]++;
        }

        vector<pair<int,int>>pair;
        for(auto it:mpp){
            pair.push_back({it.second,it.first});
        }
        
        sort(pair.rbegin() ,pair.rend());
        
        for(int i=0 ; i<k ;i++){
            ans.push_back(pair[i].second);
        }

        
        
        return ans ;
    }
};