class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        ans=[]
        temp={}
        for i in range(len(nums)):
            if nums[i] in temp:
                ans.append(temp[nums[i]][0])
                ans.append(i)
            temp[target-nums[i]]=[i,nums[i]]
        return ans;    