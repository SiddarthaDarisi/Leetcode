class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        diff = {}
        for i, num in enumerate(nums):
            complement = target - num
            if complement in diff:
                return [diff[complement], i]
            diff[num] = i