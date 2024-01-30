class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        ln = set()
        for n in nums:
            if n in ln:
                return True
            else:
                ln.add(n)
        return False