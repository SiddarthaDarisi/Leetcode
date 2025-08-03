class Solution {
public:
    int rob(vector<int>& nums) {
     int rob1=0;
     int rob2=0;
     int curr;
     for(int i:nums){
        curr=max(rob1+i,rob2);
        rob1=rob2;
        rob2=curr;
     }   
     return rob2;
    }
};